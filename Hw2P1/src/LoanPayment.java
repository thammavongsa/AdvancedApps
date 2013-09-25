import java.util.Scanner; // import scanner
 
public class LoanPayment {
 
	static Scanner input = new Scanner(System.in); // create scanner object usable in all methods
 
	public static void main(String[] args) {
 
		// Declarations
		int cont = 1;
		double loanAmount = 1;
		double interest = 1.1;
		double numberYears = 1;
		//endDeclarations
 
		System.out.println("Welcome to the loan Calculator. I will help you calculate the monthly payments on a loan"); //welcome statement
 
		System.out.print("Would you like to calculate loan payments now? Please enter 1 for Yes anything else for No: "); //loop variable input
		cont = input.nextInt();
 
		while(cont == 1){ // begin while loop
			//begin collecting data for variables
			System.out.print("Please enter the loan amount in dollars and cents. Example: $1500.75:$ ");
			loanAmount = input.nextDouble();
 
			System.out.print("Please enter the interest rate. Example: 5.7%:% ");
			interest = input.nextDouble();
 
			System.out.print("Please enter the number of years the loan will be for. Example: 15: ");
			numberYears = input.nextInt();
 
			double monthlyRepayment = getMonthlyPayment(loanAmount, interest, numberYears);
			displayOutput(monthlyRepayment);
 
			System.out.println("Would you like to calculate another Loan? Please enter 1 for Yes: ");
			cont = input.nextInt();
 
		} 
 
		System.out.println("Thanks for using the Loan Calculator!");
	}
 
	public static double getMonthlyPayment(double loanAmount, double interest, double numberYears) {
		double monthlyInterest = interest/1200;
		double monthlyRepayment = loanAmount* monthlyInterest/(1-(Math.pow(1+monthlyInterest, -numberYears*12)));
		return monthlyRepayment;
	}
 
	public static void displayOutput(double monthlyRepayment) {
		System.out.printf("The Monthly Payment: $%,.2f\n", monthlyRepayment);
	}
}