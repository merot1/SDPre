 import java.util.Scanner;
  
 public class ComparingNumbers {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         double first, second;
 
         System.out.print( "Give me two numbers. First: " );
         first = keyboard.nextDouble();
         System.out.print( "Second: " );
         second = keyboard.nextDouble();
 
         if ( first < second ) 
             System.out.println( first + " is LESS THAN " + second );
         
         if ( first <= second ) 
             System.out.println( first + " is LESS THAN/EQUAL TO " + second );
         
         if ( first == second ) 
             System.out.println( first + " is EQUAL TO " + second );
         
         if ( first >= second ) 
             System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
         
         if ( first > second ) 
             System.out.println( first + " is GREATER THAN " + second );
         
         if ( first != second ){
             System.out.println( first + " is NOT EQUAL TO " + second );
			 System.out.println( "Hey."); 
         }

     }
 }
 
/////////////////////////
//1.a) The "Hey" is not part of the last if statement because the last if statement 
//   has no bracket.  It is printing because it is a stand alone print command post 
//   the last if statement.
//1.b) The "Hey" is printed regardless of wether or not the last if statement is printed.
//2.  I have done as instructed and deleted all but last curly braces.  The program executes
//    as expected.