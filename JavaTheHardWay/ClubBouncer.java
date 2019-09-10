public class ClubBouncer {
     public static void main( String[] args ) {
         int age = 22;
         boolean onGuestList = false;
         double allure = 7.5;
         String gender = "F";
 
         if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
             System.out.println("You are allowed to enter the club.");
         }
//		 system.out.println("C-C-C-Combo Breaker");
         else {
             System.out.println("You are not allowed to enter the club.");
         }
     }
 }
 
 /////////////////////////////
 //1. It does not compile.  It gives error code "ClubBouncer.java:12: error: 'else' without 'if'
 //      else {  "    1 error
 //        ^        
 //   It does this because the 'if' statement is not immediately proceeded by the 'else' statement.
 //   I have commented out line 11 code so that this program may compile.