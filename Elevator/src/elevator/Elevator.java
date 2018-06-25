
package elevator;

/*@author amruth*/

//Packages
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class InvalidException extends Exception//Customized Exception
{   
   InvalidException(String s)
   {
       super(s);
   }
}


public class Elevator {

   private static int floor=1;
   private int choice;
   private char input;
   Scanner sc=new Scanner(System.in) ;
  Elevator()throws InvalidException //Elevator method 
    { 
    while(true)//Infinite while loop
    {   //Elevator Functions
       System.out.println("********WELCOME********");
       System.out.println("YOU ARE AT FLOOR:"+floor);
       System.out.println("Select a Floor ==> (s/S)");
       System.out.println("Fire Alarm ==> (f/F)");
       System.out.println("Quit ==> (q/Q)");
       input=sc.next().charAt(0);
try
{  
    
switch(input)//Switch case
{   
case 's': 
case 'S':
        {//Selecting a Floor
       
      
       Select_a_floor();
       
        break;
        }

        
case 'f':
case 'F':
        {//Selecting Fire Alarm
        fireAlarm();
        break;
        }


case 'q':
case 'Q':
        {//To get exit from the Elevator
        System.exit(0);
        }      


default :        //Invalid input from the keyboard
        { 
        throw new InvalidException( "Invalid selection...Kindly give a valid input(s/f/q)");
        } 
}
       
}catch(InvalidException e){e.printStackTrace();}
    }
    }
  
 public void Select_a_floor() throws InvalidException  //Selecting a floor from 1-10
 {     
       System.out.println("Enter the floor(1-10) you want to go:");
       choice=sc.nextInt();
       
       if((choice>10)||(choice<1)) //If floor not in b/w 1-10....InvalidException
               {    
                 throw new InvalidException( "Invalid selection...Kindly give a valid input(1-10)");  
               }
       if(choice==floor)
               {   
                   floor=choice ;
                   System.out.println("You have selected the destination as current floor");
                   System.out.println("YOU ARE AT FLOOR:"+floor);
               }
       else if(choice > floor)
                 {
                 Elevator_Up();//Elevator goes up
                 }
       else if(choice < floor)
                 { 
                 Elevator_Down();//Elevator goes down        
                 }
 }     
 public void fireAlarm()
 {
               //Fire Alarm..Eleavator should go to Floor 1
               System.out.println("Danger! You must exit from the Elevator now!");
               System.out.println("Don't be panic");
               choice=1;
               Elevator_Down();//Calling Elevator_Down function
               System.out.println("Wait for few seconds ");
               /*Function to stop the Elevator in floor 1 until everything is perfect and safe(Eg:here 2 secs)*/
               try{
               TimeUnit.SECONDS.sleep(2);}
               catch(InterruptedException e){}
               System.out.println("Now,Elevator is ready");
               System.out.println("YOU ARE AT FLOOR:1");
               floor=1;
 }
 public  void Elevator_Up()
         {        //Elevator going up
                  System.out.print("Going Up");
                  for(int i=floor+1;i<=choice;i++)
                  {
                  System.out.print(".."+i);   
                  }
                  System.out.print("..Ding!"); 
                  floor=choice ; 
                  System.out.println();
         }
  public  void Elevator_Down()
         {        //Elevator going Down
                  System.out.print("Going Down");
                  for(int i=floor-1;i>=choice;i--)
                  {
                  System.out.print(".."+i);   
                  }
                  System.out.print("..Ding!"); 
                  floor=choice ; 
                  System.out.println();
                 
         }

    public static void main(String[] args)throws InvalidException
    {
         Elevator obj=new Elevator();      
   //Object obj created and calling Elevator constructor
    }
}
