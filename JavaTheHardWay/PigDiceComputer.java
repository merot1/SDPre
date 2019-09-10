 public class PigDiceComputer {
     public static void main( String[] args ) {
         int roll, total;
         total = 0;
 
         do {
             roll = 1 + (int)(Math.random()*6);
             System.out.println( "Computer rolled a " + roll + "." );
             if ( roll == 1 ) {
                 System.out.println( "\tThat ends its turn." );
                 total = 0;
             }
             else {
                 total += roll;
                 System.out.print( "\tComputer has " + total );
                 System.out.print( " points so far this round.\n" );
                 if ( total < 20 ) {
                     System.out.println( "\tComputer will roll again." );
                 }
             }
         } while ( roll != 1 && total < 20 );
 
         System.out.println("Computer ends the round with " + total + " points.");
     }
 }
 
 //////////////////////////////////
 /*Scratch paper assignment
 
		ROLL	|	TOTAL
------------------------------------
	undef (9)	|	undef (9)
		6 (15)	|		0 (11)
		3 (15)	|		6 (24)
		4 (15)  |		9 (24)
		5 (15)  |	   13 (24)
		2 (15)	|	   18 (24)
		        |	   21 (24)
		