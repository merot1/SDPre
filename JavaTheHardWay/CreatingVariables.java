 public class CreatingVariables {
     public static void main( String[] args ) {
         int x, y, age, dogyears;
         double seconds, e, checking, savings;
         String firstName, lastName, title, dogfirstName, doglastName;
 
         x = 10;
         y = 400;
         age = 46;
		 dogyears = 322;
 
         seconds = 4.71;
         e = 2.71828182845904523536;
         checking = 1.89;
		 savings = 3000.23;
 
         firstName = "James";
         lastName = "Iturralde";
         title = "Mr.";
		 dogfirstName = "Zoey";
		 doglastName = "Iturralde";
 
         System.out.println( "The variable x contains " + x );
         System.out.println( "The value " + y + " is stored in the variable y." );
         System.out.println( "The experiment took " + seconds + " seconds." );
         System.out.println( "A favorite irrational # is Euler's number: " + e );
         System.out.println( "Hopefully you have more than $" + checking + "!" );
         System.out.println( "My name's " + title + " " + firstName + " " + lastName );
		 System.out.println( "I am "+ dogyears + " years old in dog years.");
		 System.out.println( "I need at least $" + savings + " to attend coding boot camp.");
		 System.out.println( "My dog's name is" + " " + dogfirstName + " " + doglastName + ".");
     }
 }