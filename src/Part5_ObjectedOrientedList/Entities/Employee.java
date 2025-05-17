package Part5_ObjectedOrientedList.Entities;

public class Employee {

    // Used in: Question2.java (Employee salary management)

    public String Name;
    public Double GrossSalary;
    public Double Tax;

    public double NetSalary() {
        return GrossSalary-Tax;
    }
    
    public void IncreaseSalary(double percentage) {
        this.GrossSalary+= GrossSalary * percentage / 100.0;
    }
    public String toString () {
        return Name + ", $ " + String.format("%.2f", NetSalary());
    }
}