import java.util.Scanner;

public class Objective5Lab1 {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int month;
	
	 System.out.println("Please enter a number for the month desired.");
	 month = scanner.nextInt();

    switch (month) {
		case 1:
        System.out.println("That is the month of January");
        break;
		case 2:
        System.out.println("That is the month of February");
        break;
		case 3:
        System.out.println("That is the month of March");
        break;
		case 4:
        System.out.println("That is the month of Arpil");
        break;
		case 5:
        System.out.println("That is the month of May");
        break;
		case 6:
        System.out.println("That is the month of June");
        break;
		case 7:
        System.out.println("That is the month of July");
        break;
		case 8:
        System.out.println("That is the month of August");
        break;
		case 9:
        System.out.println("That is the month of September");
        break;
		case 10:
        System.out.println("That is the month of October");
        break;
		case 11:
        System.out.println("That is the month of November");
        break;
		case 12:
        System.out.println("That is the month of December");
        break;
		default:
		System.out.println("That number is not equal to a calendar month,");
        System.out.println("i.e. that is not a valid month.");
		break;


    }
  }
}