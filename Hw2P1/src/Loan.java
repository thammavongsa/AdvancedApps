import java.util.Scanner; // import scanner
 
	public class Loan {
 
	static Scanner input = new Scanner(System.in); // create scanner object usable in all methods
 
		public static void main(String[] args) {
 
			// declaring variables
			int next_Step = 0;
			
			double loanPrinciple = 1;
			double interest = 1.1;
			double num_Years = 1;	
			double monthlyInterest = interest/1200;
		   
			
			//printout
 
			System.out.println("Hello."); //catz statement
			
			System.out.print("Meow, would you like to calculate catz loan payments now? 0 for 'Yes' & anything else for 'No': "); //loop variable input
			next_Step = input.nextInt();
 
			while(next_Step == 0){ // begin while loop
				//begin collecting data for variables
				System.out.print("Please enter the loan principle:$ ");
				loanPrinciple = input.nextDouble();
 
				System.out.print("Please enter the interest rate:% ");
				interest = input.nextDouble();
 
				System.out.print("Please enter the # of years the loan will be for: ");
				num_Years = input.nextInt();
 
 
				double monthlyRepayment = loanPrinciple* monthlyInterest/(1-(Math.pow(1/ (1+monthlyInterest), num_Years*12)));
 
				System.out.println("The Monthly Payment: $" + (int) (monthlyRepayment * 100 /100.0 ));
 
				System.out.println("Meow, would you like to calculate another Loan? Please enter 0 for Yes: ");
				next_Step = input.nextInt();
 
			} // endwhile
 
			System.out.println("Thanks for using the Catz Loan Calculator! ^_^");
		}
 
 
}