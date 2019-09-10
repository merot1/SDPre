public class Objective6Lab4
{
  public static void main(String[] args) 
  {
    int c1 = 0;
	int c2 = 0;
	int sum = 0;

    System.out.println("\nCalculating the total sum of numbers 1 - 20: ");

	while ( c1 <= 20 )
		{	
			System.out.print( c1 + " + " + c2 + " = " + sum + "\n" );
			c1++;
			c2 = sum;
			sum = c1 + c2;

		}
	}
}


 