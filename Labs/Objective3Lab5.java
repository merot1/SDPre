import java.util.Scanner;
 
 public class Objective3Lab5 
 {
     public static void main( String[] args ) 
	 {
         
         double n1, n2, n3;
 
         Scanner keyboard = new Scanner(System.in);
 
         System.out.println( "Please enter a number: " );
         n1 = keyboard.nextDouble();
 
         System.out.println( "Please enter another number: " );
         n2 = keyboard.nextDouble();
		 
		 n3 = (n1 + n2);
 
         System.out.println( "The sum of " + n1 + " + " + n2 + " = " + n3 );

	 }
 }
