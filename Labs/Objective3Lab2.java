import java.util.Scanner;

public class Objective3Lab2 {
  public static void main(String[] args) {

    String name;
	
	Scanner input = new Scanner(System.in);

    System.out.print( "What's your name?\t" );
	name = input.next();

	System.out.println( "\n\tHello " + name + ", I hope your having a wonderful day!" );
 
    input.close();

  }

}
