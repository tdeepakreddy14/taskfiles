package task4;
abstract class bank{
	public abstract double getintrest();
}
class SavingsAccount extends bank{
	private double intrest;
	public void setintrest(double intrest) {
		this.intrest=intrest;
	}
	public double getintrest() {
		return intrest;
	}
}
class CheckingAccount{
	private double intrest;
	public void setintrest(double intrest) {
		this.intrest=intrest;
	}
	public double getintrest() {
		return intrest;
	}
}
public class intrest_rate {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.setintrest(1.06);
		CheckingAccount ca = new CheckingAccount();
		ca.setintrest(0.06);
		System.out.println("Savings Account intrest : "+sa.getintrest()+"\nChecking Account intrest : "+ca.getintrest());
	}
}
