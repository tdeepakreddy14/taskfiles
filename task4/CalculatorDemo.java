package task4;
class calculator{
	public void performcalculation(double... numbers) { // varargs
		
	}
}
class addition extends calculator{
	public void performcalculation(double... numbers) {
		double result = 0.0;
		if(numbers.length<=2) {
			System.out.println("enter more than two inputs for addition");
		}else {
			for(double number : numbers) {
				result += number;
			}
			System.out.println("addition result : "+result);
		}
	}
}

class subraction extends calculator{
	public void performcalculation(double... numbers) {
		double result = numbers[0];
		if(numbers.length<=2) {
			System.out.println("enter more than two inputs for subraction");
		}else {
			for(int i=1;i<numbers.length;i++) {
				result -= numbers[i];
			}
			System.out.println("addition result : "+result);

		}
	}
}

class multiplication extends calculator{
	public void performcalculation(double... numbers) {
		double result = 1.0;
		if(numbers.length<=2) {
			System.out.println("enter more than two inputs for subraction");
		}else {
			for(double number:numbers) {
				result *= number;
			}
			System.out.println("addition result : "+result);
		}	
	}
}
class division extends calculator{
	public void performcalculation(double... numbers) {
		double result = numbers[0];
		if(numbers.length<=2) {
			System.out.println("enter more than two inputs for subraction");
		}else {
			for(int i=1;i<numbers.length;i++) {
				result /= numbers[i];
			}
			System.out.println("addition result : "+result);
		}
	}
}
public class CalculatorDemo {
	public static void main(String[] args) {
		addition addope = new addition();
		subraction subope = new subraction();
		multiplication mulope = new multiplication();
		division divope = new division();
		addope.performcalculation(12,23,45);
		subope.performcalculation(50,10,5);
		mulope.performcalculation(6,6,2);
		divope.performcalculation(200,4,2);
	}
}


//System.out.println("addition result : " + addresult + "\nsubraction result : " + subresult+ "\nmultiplication result : "+mulresult+"\ndivision result : "+ divresult);