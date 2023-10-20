package task4;
abstract class bank{
	public abstract double intrest();
}
class SavingsAccount extends bank{
	//private double intrest;
	public double intrest() {
		return 0.08;
	}
	
}
class CheckingAccount extends bank{
	public double intrest() {
		return 1.0;
	}
}
public class intrest_rate {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.intrest();
		CheckingAccount ca = new CheckingAccount();
		ca.intrest();
		System.out.println("Savings Account intrest : "+sa.intrest()+"\nChecking Account intrest : "+ca.intrest());
	}
}
