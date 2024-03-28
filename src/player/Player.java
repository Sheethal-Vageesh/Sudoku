package player;

public class Player 
{
    String name;
    String contactNo;
    int age;
    String emailId;
    String address;

    public Player(String name)
    {
      this.name=name;
    }
 
    public void setPlayerDetails(String name,String contactNo,int age,String emailId,String address)
    {
       this.name=name;
       this.contactNo=contactNo;
       this.age=age;
       this.emailId=emailId;
       this.address=address;
    }
 
    public void setPlayerName(String name)
    {
       this.name=name;
    }
 
    public void getPlayerDetails()
    {
       System.out.println("\nPlayer Deatils\n");
       System.out.println("Player name : "+this.name);
       System.out.println("Player age : "+this.age);
       System.out.println("Player contact Number : "+this.contactNo);
       System.out.println("Player email Id : "+this.emailId);
       System.out.println("Player address : "+this.address);
    }
 
    public String getPlayerName()
    {
     return this.name;
    }
}
