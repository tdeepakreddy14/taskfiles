package task4;
class Student {
    private String name;
    private int rollNumber;
    public void setname(String name) {
    	this.name=name;
    }
    public void setrollnumber(int rollnumber) {
    	this.rollNumber=rollnumber;
    }
    public String getName() {
    	return name;
    }
    public int getRollNumber() {
    	return rollNumber;
    }
    
    private double[] subjectGrades = new double[6];;
    public void setSubjectGrade(int subjectIndex, double grade) {
        if (subjectIndex >= 0 && subjectIndex < 6) {
            subjectGrades[subjectIndex] = grade;
        } else {
            System.out.println("Invalid subject index.");
        }
    }
    public double calculateCGPA() {
        double totalGradePoints = 0.0;
        int totalCredits = 0;
        for (double grade : subjectGrades) {
            totalGradePoints += grade;
            totalCredits++;
        }
        return totalGradePoints / totalCredits;
    }
}

public class studCGPA1{
    public static void main(String[] args) {
        Student student = new Student();
        student.setname("yashu");
        student.setrollnumber(123);
        student.setSubjectGrade(0, 7.0);
        student.setSubjectGrade(1, 8.7);
        student.setSubjectGrade(2, 7.5);
        student.setSubjectGrade(3, 7.3);
        student.setSubjectGrade(4, 9.0);
        student.setSubjectGrade(5, 9.8);
        System.out.println("Student Name: " + student.getName()+"\nStudent Rollno: "+student.getRollNumber()+"\nCGPA: " + student.calculateCGPA());
    }
}






