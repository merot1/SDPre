import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.print( "Hello. What is your first name? " );
        firstName = input.next();
    System.out.print( "Hello " + firstName + ". What is your last name? " );	
		lastName = input.next();
	System.out.print( "You said your name is " + firstName + " " + lastName + ".\n" );
	System.out.print( "How old are you? " );
	    age = input.nextInt();
    System.out.print( "\nFirst name: " + firstName + ", Last name: " + lastName + ", Age: " + age + " \n" );


    input.close();
  }
}

///////////////////
/*
System.out.print( "Hello. What is your name? " );
         name = keyboard.next();
 
         System.out.print( "Hi, " + name + "! How old are you? " );
         age = keyboard.nextInt();
*/