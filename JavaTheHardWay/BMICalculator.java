 import java.util.Scanner;
 
 public class BMICalculator {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         //double pounds, kilograms;
		 double m, kg, bmi;
 
		//System.out.print (Do you use pounds or kilograms to measure weight?");
		//pounds = keyboard.nextDouble();
		//kilograms = keyboard.nextDouble();
         System.out.print( "Your height in M (Meters): " );
         m = keyboard.nextDouble();
 
         System.out.print( "Your weight in Kg (Kilograms): " );
         kg = keyboard.nextDouble();
		 
		 bmi = kg / (m*m);
		 System.out.println( "Your BMI (Body Mass Index) is " + bmi + "\n" );
		
		
		//My code added below
		 double ft, inches, totalInches, lbs, bmi2; 
		 double LbsToKgs, InchToMeters;
		
		 System.out.println ( "Lets also use height in inches and weight in Lbs. for those silly Americans." );
		 System.out.print ( "Your height (Feet only): " );
		 ft = keyboard.nextDouble();
		 System.out.print ( "Your height (Inches): " );
		 inches = keyboard.nextDouble ();
		 
		 System.out.print ( "Your total height in only Inches: " );
		 totalInches = keyboard.nextDouble ();
		 //convert inches to meters
		 InchToMeters = totalInches*0.0254;
		 System.out.println ( "That translates to " + InchToMeters + " meters tall" );
		 
		 System.out.print ( "Your weight in Pounds: " );
		 lbs = keyboard.nextDouble ();
		 //convert lbs to kilo
		 LbsToKgs = lbs*0.4535924;
		 System.out.println ( "That translates to " + LbsToKgs + " kilograms" );
		 
		 
		 bmi2 = LbsToKgs / (InchToMeters*InchToMeters);
		 System.out.println( "Your BMI (Body Mass Index) is " + bmi2 );
		
         
     }
 }
 //Add these factors:
 //Your height in inches: 69
 //Your weight in pounds: 160
 //Your BMI is 23.625289
 
 //Your height (feet only): 5
 //Your height (inches): 9
 //Your weight in pounds: 160
 //Your BMI is 23.625289