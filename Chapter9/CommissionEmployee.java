package Chapter9;

public class CommissionEmployee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	
	//Five-argument constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		
		
		super();// Implicit call to Objects default constructor occurred
		
		
		// throw exception if grossSales is less than 0.0
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be greater than 0.0");
		
		
		
		// Throw exception if commission rate is less than 0.0
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be greater than 0.0 and less than 1.0");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be greater than 0.0");
		
		this.grossSales = grossSales;
	}


	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be greater than 0.0 and less than 1.0");
		
		
		this.commissionRate = commissionRate;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	
	
	//calculate earnings
	public double earning() {
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"grossSales", grossSales,
				"commission rate", commissionRate
				);
		
	}
	
	
	
	
}// end of main class


