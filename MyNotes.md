# ☕ Java Study Notes & Quick Reference

> **Personal learning summary** - Clean syntax reference for Java fundamentals

📅 **Updated:** July 14, 2025  
🎯 **Status:** Covering OOP fundamentals and best practices

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

## 📚 Essential Imports

```java
import java.util.Scanner;   // User input
import java.util.Locale;   // Number formatting  
import java.lang.Math;     // Mathematical operations
```

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

## � Sequential Structures (Data Types & Variables)

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

### Input & Output Operations
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

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

## � Conditional Structures

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

### Comparison Operators
```java
==  // Equal to
!=  // Not equal to
<   // Less than
>   // Greater than
<=  // Less than or equal
>=  // Greater than or equal
```

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

## � Repetitive Structures (Loops)

### For Loop
```java
// For loop
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

### While Loop
```java
// While loop
while (condition) {
    // code block
    continue;  // skip iteration
    break;     // exit loop
}
```

### Input Validation with Loops
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter grade (0-100): ");
double grade = scanner.nextDouble();

while (grade < 0 || grade > 100) {
    System.out.print("Invalid! Enter grade (0-100): ");
    grade = scanner.nextDouble();
}
```

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

## 🔧 String Formatting & Operations

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

### String vs Char Comparison
```java
// For String comparison
if (answer.equals("y")) { /* code */ }

// For char comparison  
char answer = keyboard.next().charAt(0);
if (answer == 'y') { /* code */ }
```

**Observation:** If it's String use `.equals()` and if it's char use `'char'`

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

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

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

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

### Encapsulation

**Encapsulation** shows only secure operations and keeps objects in a consistent state. An object should not expose its attributes (make them private) - they will be accessed by getters and setters methods.

```java
public class Item {
    // Private attributes (encapsulated)
    private String name;
    private double price;

    // Getter methods
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}
```

### Access Modifiers

```java
private:   // Member only can be accessed by the same class
           // (nothing/default): Member only can be accessed by the same package
protected: // Member only can be accessed by subclasses of different packages
public:    // Member is accessed by all classes (unless it resides in a different module that doesn't export the package)
```

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

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

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

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

<img src="purple-divisor.svg" width="100%" height="6" alt="Purple divisor">

## 💡 Key Reminders

- ✅ Always validate user input
- ✅ Use meaningful variable names
- ✅ Close Scanner objects
- ✅ Use `Locale.setDefault(Locale.US)` for consistency
- ✅ Constructor names must match class name
- ✅ Use `this.` for instance variables
- ✅ Practice daily for improvement

---

> **Happy coding! Keep practicing and building amazing Java applications! 🚀**
