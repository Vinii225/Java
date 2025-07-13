# ☕ Java Study Notes & Quick Reference

> **Personal learning summary** - Clean syntax reference for Java fundamentals

📅 **Updated:** July 13, 2025  
🎯 **Status:** Covering OOP fundamentals and best practices

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## 📚 Essential Imports

```java
import java.util.Scanner;   // User input
import java.util.Locale;   // Number formatting  
import java.lang.Math;     // Mathematical operations
```

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## 🔧 Input & Output

### Scanner Operations
```java
Scanner keyboard = new Scanner(System.in);

// Reading different data types
int x = keyboard.nextInt();
double y = keyboard.nextDouble();
String z = keyboard.nextLine();

keyboard.close();  // Always close scanner
```

### Output Methods
```java
System.out.print("Text");      // No line break
System.out.println("Text");    // With line break  
System.out.printf("%.2f", x);  // Formatted output
```

### Number Formatting
```java
Locale.setDefault(Locale.US);  // Decimal separator as dot (.)
```

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## 📊 Data Types & Variables

```java
// Primitive types
int number = 10;
double decimal = 3.14;
boolean flag = true;
String text = "Hello World";

// Variable naming (best practices)
Scanner keyboard = new Scanner(System.in);
String studentName;
double finalGrade;
int totalStudents;
```

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## 🔀 Control Structures

### Conditional Statements
```java
if (A == B) {
    System.out.println("Equal");
} else if (A != B) {
    System.out.println("Different");
} else {
    System.out.println("Other case");
}

// Logical operators
&&  // AND
||  // OR
!   // NOT
```

### Loops
```java
// For loop
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}

// While loop
while (condition) {
    // code block
    continue;  // skip iteration
    break;     // exit loop
}
```

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## 🎯 Object-Oriented Programming

### Class Structure
```java
public class Student {
    // Fields (private for encapsulation)
    private String name;
    private double grade;
    
    // Constructor
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    
    // Getters and Setters
    public String getName() { 
        return name; 
    }
    
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }
    
    // Methods
    public boolean isPassing() {
        return grade >= 60.0;
    }
    
    // toString method
    public String toString() {
        return "Student: " + name + ", Grade: " + grade;
    }
}
```

### Constructor Overloading
```java
// Multiple constructors
public Student() {
    this.name = "Unknown";
    this.grade = 0.0;
}

public Student(String name) {
    this.name = name;
    this.grade = 0.0;
}

public Student(String name, double grade) {
    this.name = name;
    this.grade = grade;
}
```

### Method Types
```java
// Void methods (no return)
public void addQuantity(int amount) {
    this.quantity += amount;
}

// Methods with return value
public double calculateTotal(int quantity, double price) {
    return quantity * price;
}

public int sum(int a, int b) {
    return a + b;
}
```

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## 🧮 Mathematical Operations

```java
// Math class methods
Math.PI                    // Pi constant
Math.sqrt(x)              // Square root
Math.pow(x, y)            // Power operation
Math.abs(x)               // Absolute value
Math.max(a, b)            // Maximum value
Math.min(a, b)            // Minimum value

// Arithmetic shortcuts
x++;        // x = x + 1
x--;        // x = x - 1
x += 3;     // x = x + 3
x *= 2;     // x = x * 2
```

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## 🚀 Advanced Concepts

### Arrays
```java
// Array declaration and initialization
int[] numbers = new int[5];
String[] names = {"Alice", "Bob", "Charlie"};

// Accessing elements
numbers[0] = 10;
String firstName = names[0];
System.out.println(numbers.length);
```

### ArrayList (Dynamic Arrays)
```java
import java.util.ArrayList;

ArrayList<String> students = new ArrayList<>();
students.add("Alice");
students.add("Bob");
students.remove("Alice");
System.out.println(students.size());
```

### Input Validation
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter grade (0-100): ");
double grade = scanner.nextDouble();

while (grade < 0 || grade > 100) {
    System.out.print("Invalid! Enter grade (0-100): ");
    grade = scanner.nextDouble();
}
```

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## � Useful Shortcuts

### String Formatting
```java
String name = "Alice";
int age = 20;
double grade = 85.75;

// Printf formatting
System.out.printf("Name: %s, Age: %d, Grade: %.2f%n", name, age, grade);

// String.format
String formatted = String.format("Grade: %.2f", grade);
```

### Comparison Operators
```java
==  // Equal to
!=  // Not equal to
<   // Less than
>   // Greater than
<=  // Less than or equal
>=  // Greater than or equal
```

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## 🎲 Practice Examples

### Simple Calculator
```java
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        return (b != 0) ? a / b : 0;
    }
}
```

### Enhanced Student Class
```java
public class Student {
    private String name;
    private double grade;
    
    public Student(String name) {
        this.name = name;
        this.grade = 0.0;
    }
    
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }
    
    public String getStatus() {
        return (grade >= 60.0) ? "PASS" : "FAIL";
    }
}
```

<img src="purple-diviser.svg" width="100%" height="6" alt="Purple divider">

## � Key Reminders

- ✅ Always validate user input
- ✅ Use meaningful variable names
- ✅ Close Scanner objects
- ✅ Use `Locale.setDefault(Locale.US)` for consistency
- ✅ Constructor names must match class name
- ✅ Use `this.` for instance variables
