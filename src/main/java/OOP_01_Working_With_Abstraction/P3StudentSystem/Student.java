package OOP_01_Working_With_Abstraction.P3StudentSystem;

public class Student {
    private String studentName;
    private int studentAge;
    private double studentGrade;

    public Student(String studentName, int studentAge, double studentGrade) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(double studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        String commentary = "";
        if (this.studentGrade <= 3.5) {
            commentary = "Very nice person.";
        } else if (this.studentGrade <= 4.5) {
            commentary = "Average student.";
        } else {
            commentary = "Excellent student.";
        }
        return studentName + " is " + studentAge + " years old. " + commentary;
    }
}
