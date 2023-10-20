package task5;
class student{
	private String name;
	private int rollno;
	student(String name,int rollno){   //parameterized constructor
		this.name=name;
		this.rollno=rollno;
	}
	student(){				//default comstructor
		this("deepak",21);
	}
	
	public String getname() {
		return name;
	}
	public int getrollno() {
		return rollno;
	}
	
}
public class constructorchain {
	public static void main(String[] args) {
		student s2 = new student("varshini",21);
		student s1 = new student();
		System.out.println("Student1 name : "+s1.getname()+"\nstudent1 rollno : "+s1.getrollno()+"\n\nStudent2 name : "+s2.getname()+"\nstudent2 rollno : "+s2.getrollno());
	}
}
