import java.util.Scanner;
public class Population {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 //Prints out questions for the user to plug in input
	System.out.println("Enter annual growth rate:");
	double annualgrowthrate = input.nextDouble();
	System.out.println("Enter current year:");
	int Year = input.nextInt();
	System.out.println("Enter current population:");
	double population = input.nextDouble();
	// the assignment columns
	System.out.printf("%-15s", "Year");
	System.out.printf("%4s", "Population");
	// new line
	System.out.println();
	for (int i=0; i<=9; i+=1) {
		
		//new line
		System.out.println();
		// column for the calculated year
		System.out.printf("%-15s", Year);
		// column for the calculated population
		System.out.printf("%4s", population);
		// equation to add a year
		Year += 1;
		// equation to caculate the population
		population = population + (annualgrowthrate/100) * population;
	}

	}
}