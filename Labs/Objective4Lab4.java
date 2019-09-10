import java.util.Scanner;

public class Objective4Lab4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
 
      double userNum;

      System.out.println("Please enter a number and I will determine if it is odd or even: ");
      userNum = scanner.nextDouble();


       if(userNum % 2 == 0)
	   {
       System.out.println( "Your number is an even number." );
       }

       if(userNum % 2 != 0)
	   {
       System.out.println( "Your number is an odd number." );
       }

       if(userNum == 0)
	   {
       System.out.println( "Stop trying to be funny and enter a larger number." );
       }

       scanner.close();
  }
}

/*
int num = 6;

  
*/