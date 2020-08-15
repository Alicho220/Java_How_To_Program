package Chapter9;

public class BasePlusCommissionEmployee {
	
	 // BasePlusCommissionEmployee class represents an employee who receives
	 // a base salary in addition to commission.
	
	
	 private final String firstName;
	 private final String lastName;
	 private final String socialSecurityNumber;
	 private double grossSales; // gross weekly sales
	 private double commissionRate; // commission percentage
	 private double baseSalary;
	
	
	 // six-argument constructor
	 public BasePlusCommissionEmployee(String firstName, String lastName,
	 String socialSecurityNumber, double grossSales,
	 double commissionRate, double baseSalary )
	 {
	 // implicit call to Object's default constructor occurs here

	// if grossSales is invalid throw exception
	 if (grossSales < 0.0)
	 throw new IllegalArgumentException(
	 "Gross sales must be >= 0.0");
	
	 // if commissionRate is invalid throw exception
	 if (commissionRate <= 0.0 || commissionRate >= 1.0)
	 throw new IllegalArgumentException(
	 "Commission rate must be > 0.0 and < 1.0");
	

	// if baseSalary is invalid throw exception
	if (baseSalary < 0.0)
	throw new IllegalArgumentException(
	"Base salary must be >= 0.0");
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;

	 }


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0)
			 throw new IllegalArgumentException(
			 "Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
	}


	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
		 if (commissionRate <= 0.0 || commissionRate >= 1.0)
			 throw new IllegalArgumentException(
			 "Commission rate must be > 0.0 and < 1.0");
		 
		this.commissionRate = commissionRate;
	}


	public double getBaseSalary() {
		return baseSalary;
	}

	//public void setSocialSecurityNumber(String socialSecurityNumber) {
		//this.socialSecurityNumber = socialSecurityNumber;
	//}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
			"Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"grossSales", grossSales,
				"commission rate", commissionRate,
				"base salary", baseSalary);
	}// end of toString method
		
	 
	 
}// end of class BasePlusCommissionEmployee