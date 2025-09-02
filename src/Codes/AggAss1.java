package Codes;

public class AggAss1 {
    public static void main(String[] args) {
        Subject subject = new Subject("Maths");
        AggStudent student = new AggStudent(101, "Nate", subject);
        student.displayDetails();
    }
}
//hi


class Subject {
    private String subjectName;

    Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    // Getter method to access private member
    public String getSubjectName() {
        return subjectName;
    }

    // Setter method to modify private member (optional)
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}


class AggStudent {
    private int rollNo;
    private String studentName;
    private Subject subject;

    AggStudent(int rollNo, String studentName, Subject subject) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.subject = subject;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Subject Name: " + subject.getSubjectName());
    }
}
