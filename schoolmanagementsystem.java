class staff_members{
	String name;
	int empId;
	double salary;
	public staff_members(String name,int empId,double salary) {
		this.name = name;
		this.empId=empId;
		this.salary=salary;
	}
	public void get_details() {
		System.out.println("emloye name : "+name);
		System.out.println("emp id : " + empId);
		System.out.println("emp salary : "+salary);
	}
}
class teacher extends staff_members{
	String subject;
	public teacher(String name,int empId,double salary,String subject) {
		super(name,empId,salary);
		this.subject = subject;
	}
	public void responsibility(){
		System.out.println("responsible for giving knowledge to students");
	}
	public void role() {
		System.out.println("roll : "+subject+" Teacher");
	}
}
class administrator extends staff_members{
	public administrator(String name,int empId,double salary) {
		super(name,empId,salary);
		
	}
	public void responsibility(){
		System.out.println("responsible for organizing and storing information in dogotal form");
	}
	
	public void role() {
		System.out.println("roll : administrator");
	}
}
class supportstaff extends staff_members{
	public supportstaff(String name,int empId,double salary) {
		super(name,empId,salary);
	}
	public void responsibility(){
		System.out.println("responsible for assisting and supporting students");
	}
	public void role() {
		System.out.println("roll : supportstaff");
	}
}

class schoolmanagementsystem{
	public static void main(String[] args) {
		teacher Teacher = new teacher("varshini",143,50000,"math");
		Teacher.get_details();
		Teacher.responsibility();
		Teacher.role();
		System.out.println(" ");
		
		administrator adm = new administrator("yashu",223,35000);
		adm.get_details();
		adm.responsibility();
		adm.role();
		System.out.println(' ');
		
		supportstaff suppstaff = new supportstaff("charan",224,25000);
		suppstaff.get_details();
		suppstaff.responsibility();
		suppstaff.role();
	}
}
