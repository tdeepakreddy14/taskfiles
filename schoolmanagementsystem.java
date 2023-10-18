class staff_members{
	String name;
	int empId;
	double salary;
	String responsibility;
	String role;
	public staff_members(String name,int empId,double salary) {
		this.name = name;
		this.empId=empId;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getEmployeeID() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setresponsibility(String responsibility) {
		this.responsibility=responsibility;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setrole(String role) {
		this.role=role;
	}
	public String getrole() {
		return role;
	}
}
class teacher extends staff_members{
	String subject;
	public teacher(String name,int empId,double salary) {
		super(name,empId,salary); 
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
}
class administrator extends staff_members{
	String work;
	public administrator(String name,int empId,double salary) {
		super(name,empId,salary);
	}
	public void setwork(String work) {
		this.work = work;
	}
	public String getwork() {
		return work;
	}
}
class supportstaff extends staff_members{
	String subject;
	public supportstaff(String name,int empId,double salary) {
		super(name,empId,salary);
	}
	public void setsubject(String subject) {
		this.subject=subject;
	}
	public String getsubject() {
		return subject;
	}
}

class schoolmanagementsystem{
	public static void main(String[] args) {
		teacher Teacher = new teacher("varshini",143,50000);
		Teacher.setSubject("math");
		Teacher.setresponsibility("responsible for giving knowledge to students");
		Teacher.setrole("Teacher");
		System.out.println("Teacher Details-  name:" + Teacher.getName() + ", empId:" + Teacher.getEmployeeID() + ", salary:" + Teacher.getSalary()+", subject:" + Teacher.getSubject()+"\nresponsibility - "+Teacher.getResponsibility()+"\nrole - "+Teacher.getrole()+"\n");
		
		administrator adm = new administrator("yashu",223,35000);
		adm.setresponsibility("responsible for organizing and storing information in dogotal form");
		adm.setrole("administrator");
		adm.setwork("manage files");
		System.out.println("administrator Details-  name:" + adm.getName() + ", empId:" + adm.getEmployeeID() + ", salary:" + adm.getSalary()+"\nresponsibility - "+adm.getResponsibility()+"\nwork: " +adm.getwork()+"\nrole - "+adm.getrole()+"\n");
		
		supportstaff suppstaff = new supportstaff("charan",224,25000);
		suppstaff.setsubject("math");
		suppstaff.setresponsibility("responsible for assisting and supporting students");
		suppstaff.setrole("supportstaff");
		System.out.println("suppstaff Details-  name:" + suppstaff.getName() + ", empId:" + suppstaff.getEmployeeID() + ", salary:" + suppstaff.getSalary()+", subject:" + suppstaff.getsubject()+"\nresponsibility - "+suppstaff.getResponsibility()+"\nrole - "+suppstaff.getrole());
		
	}
}
