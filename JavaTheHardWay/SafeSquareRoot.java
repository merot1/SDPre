 import java.util.Scanner;
 
 public class SafeSquareRoot {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         double x, y;
		 String reply;
 
         System.out.print("Give me a number, and I'll find it's square root. ");
         System.out.print("\n(No negatives, please.) ");
         System.out.print ("\nIndicate Yes or No to begin the program: ");

/////////////////////////
//My Code
		reply = keyboard.next();
		
		while (reply.equals("NO") || reply.equals("no") || reply.equals("No")) {
			System.out.println("Let me know if your ready now...");
			reply = keyboard.next();
		}

		System.out.println("Okay, so what # are you thinking, jr.?");
			x = keyboard.nextDouble();
 
		while ( x < 0 ) {
             System.out.println("I won't take the square root of a negative.");
             System.out.print("\nNew number: ");
             x = keyboard.nextDouble();
         }
 
         y = Math.sqrt(x);
		 
         System.out.println("The square root of "+x+" is "+y);
     }
 }