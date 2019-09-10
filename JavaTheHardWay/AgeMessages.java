 import java.util.Scanner;
 
 public class AgeMessages {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         int age;
 
         System.out.print( "How old are you? " );
         age = keyboard.nextInt();
 
         System.out.println( "You are: " );
         if ( age < 13 ) {
             System.out.println( "\ttoo young to create a Facebook account" );
         }
         if ( age < 16 ) {
             System.out.println( "\ttoo young to get a driver's license" );
         }
         if ( age < 18 ) {
             System.out.println( "\ttoo young to get a tattoo" );
         }
         if ( age < 21 ) {
             System.out.println( "\ttoo young to drink alcohol" );
         }
         if ( age < 35 ) {
             System.out.println( "\ttoo young to run for President of the U.S." );
            
		 }	 
		//My code
		 if ( age >= 65 ) {
			System.out.println( "\told enough to retire!" );
			 System.out.println( "\t\t( How sad! )" );
         }
		 if ( age <= 65 ) {
			System.out.println( "\tto young to retire!" );
			 System.out.println( "\t\t( How sad! )" );
         }
		 if ( age >= 13 ) {
             System.out.println( "\told enough to create a Facebook account" );
         }
         if ( age >= 16 ) {
             System.out.println( "\told enough to get a driver's license" );
         }
         if ( age >= 18 ) {
             System.out.println( "\told enough to get a tattoo" );
         }
         if ( age >= 21 ) {
             System.out.println( "\told enough to drink alcohol" );
         }
         if ( age >= 35 ) {
             System.out.println( "\told enough to run for President of the U.S." );
		}
	 }
 }
 
 //1) Age greater than 35 returns "You are:" and nothing else. 
 //   Why, because that phrase is printed before any if statements are evaluated and 
 //   older than 35 means that no if statements apply or will be printed.
 //2) if statement added
 //3) 5 opposite if statements added