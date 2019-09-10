 import java.util.Scanner;
 
 public class RunningTotal 
{
     public static void main( String[] args ) 
	 {
         Scanner keyboard = new Scanner(System.in);
         int current = 1, total = 0;//Set current = 1, for while loop
 
         System.out.print("Type in a bunch of values and I'll add them up. ");
         System.out.println("I'll stop when you type a zero.");
			current = keyboard.nextInt();
			
         while ( current != 0 )
			 {
             System.out.print("Value: ");
             current = keyboard.nextInt();
             total = current + total;
			 }
			 if ( current != 0){
             System.out.println("The total so far is: " + total);
			 }
			 else if ( current == 0 ) 
			 {
			 System.out.println("The final total is: " + total);
			 keyboard.close();
//			 out.println();
			 }

		 //while ( current != 0 );
         //System.out.println("The final total is: " + total);
     }
 }