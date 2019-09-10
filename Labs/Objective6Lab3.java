public class Objective6Lab3 
{
  public static void main(String[] args) 
  {
    int counter = 1;
	String even = " is even";
	String odd = " is odd";

    System.out.println("\nCounting from 0-20:\n");

		
    while(counter <= 20)

	{
	  if (counter % 2 == 0)
	  {
         System.out.println(counter + even);
	  }
      else
	  {
         System.out.println(counter + odd);
	  }
	
	counter++;
	
	}
	
  }	
}		
