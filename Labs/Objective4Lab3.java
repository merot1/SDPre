import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
 
      double userNum, x;
	  x = 0;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextDouble();

	  if ( userNum < x ) {
      System.out.println( "Your number is less than " + x );
      }
	  if ( userNum > x ) {
      System.out.println( "Your number is greater than " + x );
      }
	  if ( userNum == x ) {
      System.out.println( "Your number is equal to " + x );
      }
	  

      scanner.close();
  }
}
