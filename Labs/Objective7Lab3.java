import java.util.Scanner;

public class Objective7Lab3
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int choice;
	String food = "error";

    printMenu();//////////////////////

	choice = keyboard.nextInt();

	while ( choice <=3)
	{
         if ( choice == 1 )
		 {
			System.out.println( "\nHello" );
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
			System.out.println( "\nExit. Goodbye!");
//          scanner.close();
			break;
		 }
   	}


    public static void printMenu()
	{
		System.out.println("\n_____Menu_____");
		System.out.println("1: Say Hello");
		System.out.println("2: List My favorite foods");
		System.out.println("3: Exit");
		System.out.println();
	}

  }
}
