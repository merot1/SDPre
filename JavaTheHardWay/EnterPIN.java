import java.util.Scanner;
 
 public class EnterPIN {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         int pin, entry2;
		 String rPassword, tPassword;
		
		 rPassword = ("Hunter2");
         pin = 12345;
 
         System.out.println("WELCOME TO THE BANK OF JAVA.");

/////////////////////
//My Code
		 System.out.println("ENTER YOUR PASSWORD: ");
		 tPassword = keyboard.next();
		 
		while ( ! tPassword.equals(rPassword) ) {
             System.out.println("\nINCORRECT PASSWORD.");
             System.out.print("ENTER YOUR PASSWORD: ");
             tPassword = keyboard.next();
         }		 
		 
		 System.out.println("\nPASSWORD ACCEPTED.");
		 
         System.out.print("ENTER YOUR PIN: ");
         entry2 = keyboard.nextInt();
 
         while ( entry2 != pin ) {
             System.out.println("\nINCORRECT PIN. TRY AGAIN.");
             System.out.print("ENTER YOUR PIN: ");
             entry2 = keyboard.nextInt();
         }
 
         System.out.println("\nPASSWORD AND PIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
     }
 }