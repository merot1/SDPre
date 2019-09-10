 public class MathOperations {
     public static void main( String[] args ) {
         int a, b, c, d, e, f, g;
         double x, y, z;
         String one, two, both;
 
         a = 10;
         b = 27;
         System.out.println( "a is " + a + ", b is " + b );
 
         c = a + b;
         System.out.println( "a+b is " + c );
         d = a - b;
         System.out.println( "a-b is " + d );
         e = a+b*3;
         System.out.println( "a+b*3 is " + e );
         f = b / 2;
         System.out.println( "b/2 is " + f );
         g = b % 10;
         System.out.println( "b%10 is " + g );
 
         x = 1.1;
         System.out.println( "\nx is " + x );
         y = x*x;
         System.out.println( "x*x is " + y );
         z = b / 2;
         System.out.println( "b/2 is " + z );
         System.out.println();
 
         one = "dog";
         two = "house";
         both = one + two;
         System.out.println( both );
		 
		 //my contribution.......................................
		 int l;
		 double h, i, j, k, m;
		 
		 h = 46;//my age
		 i = 76;//human life expectancy
		 k = 4.5;//dog's age
		 l = 11;//large dog life expectancy
		 
		 System.out.println ( "\n\n" + "My age of " + h + " is " + h/i + " of today's \ntypical human life span of 76 years." );
		 System.out.println ( "\n\n" + "My dog's age of " + k + " years is " + k/l + " of today's \ntypical life span for a large dog." );
     }
 }