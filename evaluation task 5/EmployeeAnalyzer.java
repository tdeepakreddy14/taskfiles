import java.io.*;
import java.util.*;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	
	public Employee(String name,int age,String department,double salary) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary=salary;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String name;
    private int age;
    private String department;
    private double salary;
    
}
public class EmployeeAnalyzer{
	public static void main(String[] args) throws Exception{
		File f = new File("D:\\deepak\\javatraining\\taskfiles\\evaluation task 5\\data.csv");
		BufferedReader bf =  new BufferedReader(new FileReader(f));
		bf.readLine();
		List<Employee> list = new ArrayList<>();
		String line;
		while((line = bf.readLine()) != null ) {
			String[] array = line.split(",");
			list.add(new Employee(array[0],Integer.parseInt(array[1]),array[2],Double.parseDouble(array[3])));
		}
		System.out.println("Average Salary by Department : ");
		AverageSalary(list);
		
		System.out.println("Youngest and Oldest Employee: ");
		YoungestandOldestEmployee(list);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter n");
		int n = sc.nextInt();
		System.out.println("Top Earning Employees: ");		
		TopEarningEmployees(list,n);
		bf.close();
		sc.close();
	}
	public static void AverageSalary(List<Employee> employee) {
		Map<String,Double> salMap = employee.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		for(Map.Entry<String,Double> m1 : salMap.entrySet())
			System.out.println(m1);
	}
	
	public static void YoungestandOldestEmployee(List<Employee> employee) {
		employee.stream().filter(e1 -> e1.getAge() <=24).forEach(e1 -> System.out.println("Yongust employee : "+e1.getName()));
		employee.stream().filter(e2 -> e2.getAge() > 24).forEach(e1 -> System.out.println("oldest employee : "+e1.getName()));
	}

	public static void  TopEarningEmployees(List<Employee> employee,int N) {
		employee.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.limit(N)
				.forEach(s -> System.out.println(s.getName() + " : "+s.getSalary()));
				
	}
}
