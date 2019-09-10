 import java.util.Scanner;
 
 public class BMICategories {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         double bmi;
		 double h, w;
 
 //        System.out.print( "Enter your BMI: " );
 //        bmi = keyboard.nextDouble();
 //////////////////////
 //My Code
 System.out.println ( "Enter your height and weight to determine your BMI." );
 System.out.println ( "Enter your height in inches, first: " );
		h = keyboard.nextDouble();
 System.out.println ( "Enter your weight in lbs: ");
		w = keyboard.nextDouble();
		
		bmi = ( w/(h*h))*703;
		System.out.println ( "Your BMI is " + bmi ); 
 
 
 
 
 
         System.out.print( "BMI category: " );
         if ( bmi < 15.0 ) {
             System.out.println( "very severely underweight" );
         }
         else if ( bmi <= 16.0 ) {
             System.out.println( "severely underweight" );
         }
         else if ( bmi < 18.5 ) {
             System.out.println( "underweight" );
         }
         if ( bmi < 25.0 ) {
             System.out.println( "normal weight" );
         }
         else if ( bmi < 30.0 ) {
             System.out.println( "overweight" );
         }
         else if ( bmi < 35.0 ) {
             System.out.println( "moderately obese" );
         }
         else if ( bmi < 40.0 ) {
             System.out.println( "severely obese" );
         }
         else {
             System.out.println( "very severely/\"morbidly\" obese" );
         }

     }
 }
 
 //////////////////////////
 //1. If I commented out the "else" as part of the "else if" command then it executed normally.
 //   If I deleted the word else entirely from line 21, then it created to entirely different 
 //   "if" && "else if" logic command sections.  Then it executed both seperately.
 //2.  Code entered for height and weight conversion to BMI.