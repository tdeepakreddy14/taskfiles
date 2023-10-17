class student{
	String studName;
	int studRollno;
	public student(String studName , int studRollno) {
		this.studName =studName;
		this.studRollno=studRollno;
	}
	public String getName() {
		return studName;
	}
	
	public int getRollno() {
		return studRollno;
	}
	public static void main(String[] args) {
		student s1 = new student("deepak",21);
		student s2 = new student("charan",20);
		student s3 = new student("yashu",22);
		System.out.println("student1 name: "+s1.getName()+", student1 age: "+ s1.getRollno());
		System.out.println("student2 name: "+s2.getName()+", student2 age: "+ s2.getRollno());
		System.out.println("student3 name: "+s3.getName()+", student3 age: "+ s3.getRollno());
	}
}