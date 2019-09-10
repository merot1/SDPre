 import java.util.Scanner;

public class Objective6Lab5 
{
  public static void main(String[] args) 
  {
    int choice;
	String food = "error";
	
	Scanner keyboard = new Scanner(System.in);

 
	  System.out.println("\nChoose which option you would like:"); 
	  System.out.println("\n_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List Your favorite food");
      System.out.println("3: Exit");
      System.out.println();
	  
	choice = keyboard.nextInt();

	while ( choice <=3)
	{
         if ( choice == 1 )
		 {
			System.out.println( "\nHello Earthling!" );
			break;
		 }
         else if ( choice == 2 )
		 {
			 System.out.println( "List your favorite food:" ); 
				{
				food = keyboard.next();
				System.out.println( "You listed: " + food );
				}
				break;
	}
		 	 
	else if ( choice >= 3 )
		{
			System.out.println( "\nError. Goodbye!");
			break;
		}
	


	}

   }
  
}

