public class student{
	String studName;
	int studRollno;
	public void setName(String studName) {
		this.studName =studName;
	}
	public void setRollno(int studRollno) {
		this.studRollno=studRollno;
	}
	String getName() {
		return studName;
	}
	public int getRollno() {
		return studRollno;
	}
	public static void main(String[] args) {
		student s1 = new student();
		s1.setName("deepak");
		s1.setRollno(222);
		
		student s2 = new student();
		s2.setName("yashu");
		s2.setRollno(211);

		System.out.println("student1 name: "+s1.getName()+", student1 age: "+ s1.getRollno());
		System.out.println("student2 name: "+s2.getName()+", student2 age: "+ s2.getRollno());
	}
}
