package Part5_ObjectedOrientedList.Entities;

public class Employee {

    // Used in: Question2.java (Employee salary management)

    public String name;
    public Double grossSalary;
    public Double tax;

    public double netSalary() {
        return grossSalary - tax;
    }
    
    public void increaseSalary(double percentage) {
        this.grossSalary += grossSalary * percentage / 100.0;
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}