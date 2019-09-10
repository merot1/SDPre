import java.util.Scanner;

	public class Objective3Lab1 {
		public static void main( String[] args ) 
		{
		String keyStrokes; 
		Scanner input = new Scanner(System.in);

		System.out.print( "Please Type a word: \n" );
		keyStrokes = input.next();           
		System.out.print( "\nYou typed: " + keyStrokes + "\n");         

        input.close();

		}
	}
