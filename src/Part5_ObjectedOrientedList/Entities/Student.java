package Part5_ObjectedOrientedList.Entities;

public class Student {

    // Used in: Question3.java (Student grades and approval)

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double getFinalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double verifyPoints() {
        if (getFinalGrade() < 60) {
            return 60 - getFinalGrade();
        } else {
            return 0.0;
        }
    }
}