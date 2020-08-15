package Chapter8;

public class SavingsAccount {
	private double annualInterest;
	private double savingsBalance = 0.0;
	
	
	
	
	
	public SavingsAccount(double annualInterest, double savingsBalance) {
		this.annualInterest = annualInterest;
		this.savingsBalance = savingsBalance;
	}
	
	
	




	public double getAnnualInterest() {
		return annualInterest;
	}




	public void setAnnualInterest(double annualInterest) {
		this.annualInterest = annualInterest;
	}




	public double getSavingsBalance() {
		return savingsBalance;
	}




	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}




	public double calculateMonthlyInterest() {

		double monthlyInterest = (savingsBalance * annualInterest)/12 ;
		
		
		return monthlyInterest;
		
		
	}
	
	public double calculateNewSavingsBalance() {
		
		double newBalance = savingsBalance + calculateMonthlyInterest();
		
		return newBalance;
	}

}
