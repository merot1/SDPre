
  import static java.lang.System.*;
  import java.util.Scanner;
  
  public class CollegeAdmission {
      public static void main( String[] args ) {
          Scanner keyboard = new Scanner(System.in);
          int math;
  
          out.println( "Welcome to the UT Austin College Admissions Interface!" );
         out.print( "Please enter your SAT math score (200-800): " );
         math = keyboard.nextInt();
 
         out.print( "Admittance status: " );
 
         if ( math >= 790 )
             out.print( "CERTAIN " );
//		 else if ( math >= 390 )
//             out.print( "UNLIKELY " );
         else if ( math >= 710 )
             out.print( "SAFE " );
         else if ( math >= 580 )
             out.print( "PROBABLE " );
         else if ( math >= 500 )
             out.print( "UNCERTAIN " );
         else if ( math >= 390 )
             out.print( "UNLIKELY " );
         else // below 390
             out.print( "DENIED " );
 
         out.println();
     }
 }
 
/////////////////////////
//1. Removed all "else" statements to run program.  Only last statement displayed of "DENIED"
//   Then put all else statements back.
//2. Moved lines 23 & 24 between lines 16 & 17.  It said that it should compile but, in created 
//   2 errors for me.  I ran the lines of 23 and 24 beginning on line 17 and got the desired affect.
//3. I then created CollegeAdmissionExpanded.java and executed to see results.