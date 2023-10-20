package task5;
class Stud{
	private String name;
	private int rollno;
	public Stud(String name,int rollno){    //constructor
		this.name =name;
		this.rollno=rollno;
	}
	public void intro() {   //method for obj manipulation
		System.out.println("my name is "+name +" and my rollno is "+rollno);
	}
	
}
public class objlifecycle {
	public static void main(String[] args) {
		Stud s1 = new Stud("deepak",22);
		s1.intro();
	}
}
