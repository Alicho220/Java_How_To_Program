package Chapter8;

public class SavingsAccountTest {

	public static void main(String...args) {
		
		SavingsAccount saver1 = new SavingsAccount(0.04, 2000.00);
		SavingsAccount saver2 = new SavingsAccount(0.04, 3000.00);
		
		saver1.calculateNewSavingsBalance();
		System.out.println(saver1.calculateNewSavingsBalance());
		
		
		
	}
}
