package board;

import java.util.*;
import triple.Triple;

public class Board 
{
  public int size;
  public  int matrix[][];

  public Board(int size)
  {
    this.size=size;
    matrix=new int[size][size];
  }

  public void printBoard()
  {
    for(int i=0;i<size;i++)
    {
        if(i%3==0)
           System.out.println();
           
        for(int j=0;j<size;j++)
        {
          if(j%3==0)
           System.out.print(" "); 

           System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
  }

  public void setUpBoardConfig(int row,int col,int val)
  {
    this.matrix[row][col]=val;
  }

  public void setUpColumnWise(int row,List<Integer> col,List<Integer> val)
  {
    for(int i=0;i<col.size();i++)
    {
      this.matrix[row][col.get(i)]=val.get(i);
    }
  }

  public void setUpBoard(List<Triple> t)
  {
    for(int i=0;i<t.size();i++)
    {
      this.matrix[t.get(i).row][t.get(i).col]=t.get(i).val;
    }
  }
}
