 public class ThereAndBackAgain {
     public static void main( String[] args ) {
         System.out.println( "Here." );
         erebor();
         System.out.println( "Back first time." );
         //erebor();
         System.out.println( "Back second time." );
     }
 
     public static void erebor() {
         System.out.println( "There." );
     }
 }
 
 //////////////////////////////////////////
 //1. When I remove the parenthesis from line 4, it does not compile but, it reads error 
 //   message on line 5, not line 4.
 //2. I think that with code from line 6 commented out that it will compile
 //   with out issue but, not print any code related to line 6.  I was right....