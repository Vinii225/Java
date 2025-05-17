package Part5_ObjectedOrientedList.Entities;

public class Student {

    // Used in: Question3.java (Student grades and approval)

    public String Name;
    public double Grade1;
    public double Grade2;
    public double Grade3;

    public double FinalGrade() {
        return Grade1+Grade2+Grade3;
    }

    public double VerifyPoints() {
        if (FinalGrade()<60) {
            return 60 - FinalGrade();
        } else {
            return 0.0;
        }
    }
}