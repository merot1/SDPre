

public class Objective2Lab5 //Print out the hypotenuse
{	
public static void main(String[] args)
{
    double num1 = Math.sqrt(9 * 9);    //num = 9
	double num2 = Math.sqrt(16 * 16);  //num = 16
    double result = Math.sqrt(num1) + Math.sqrt(num2); //result => square root of 9 + 16 or square root of (num1 squared + num2 squared)
	
	
	System.out.println ( "The hypotenuse of a right triangle with sides measuring " );
	System.out.println ( num1 + "and " + num2 + " = " + "a hypotenuse of " + result );
	
}
}
