package StudentManagementSystem;

public class grade {
	public String calculateGrade(double marks) {

        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "Fail";
    }

    public void display(student s) {

        System.out.println("Student ID : " + s.getId());
        System.out.println("Student Name : " + s.getName());
        System.out.println("Marks : " + s.getMarks());
        System.out.println("Grade : " + calculateGrade(s.getMarks()));
    }
}


