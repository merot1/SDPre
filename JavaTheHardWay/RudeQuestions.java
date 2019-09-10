import java.util.Scanner;
 
 public class RudeQuestions {
     public static void main( String[] args ) {
         String name;
         int age;
         double weight, income;
 
         Scanner keyboard = new Scanner(System.in);
 
         System.out.print( "Hello. What is your name? " );
         name = keyboard.next();
 
         System.out.print( "Hi, " + name + "! How old are you? " );
         age = keyboard.nextInt();
 
         System.out.println( "So you're " + age + ", eh? That's not very old." );
         System.out.print( "How much do you weigh, " + name + "? " );
         weight = keyboard.nextDouble();
 
         System.out.println( weight + "! Better keep that quiet!!" );
         System.out.print("What's your income, " + name + "? " );
         income = keyboard.nextDouble();
 
         System.out.print( "Hopefully that is " + income + " per hour" );
         System.out.println( " and not per year!" );
         System.out.print( "Well, thanks for answering my rude questions, " );
         System.out.println( name + "." );
		 
		 //My input
		 String dogsName;
		 System.out.println ( "Finally, what is your dog's name?");
		 dogsName = keyboard.next();
		 System.out.println ( "Make sure to feed and water " + dogsName + " everyday.");
     }
 }
 
 // 1. It blows up if a double is placed where an integer should go.  It is waiting for an integer not able to process a double.
 // 2. It accepts a numerical input as a String. But it gives it a String value.  Your name is "7883734".
 // 3. It gives a java error: Exception in thread "main" java.util.InputMismatchException because it could not rectify input with declared type of expected answer.
 // 4. New question and statments inserted as directed. 