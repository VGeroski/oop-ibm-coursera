// TestEncapsulation class to test the Employee class
public class TestEncapsulation {

    public static String compareSalaries(Employee first, Employee second) {
        double firstSalary = first.getSalary();
        double secondSalary = second.getSalary();

        if (firstSalary > secondSalary)
            return first.getName();
        
        if (firstSalary < secondSalary)
            return second.getName();
        
        return "Equal salaries";
    }

    public static void main(String[] args) {
        // Step 1: Create two instances of the Employee class
        // One using the parameterized constructor and one using default constructor with setters
        Employee emp1 = new Employee("Emp1", 30, 100);
        Employee emp2 = new Employee();
        emp2.setName("Emp2");
        emp2.setAge(25);
        emp2.setSalary(50);

        // Step 2: Print details of both employees
        System.out.println("Informations after empoyee creation");
        emp1.display();
        emp2.display();

        // Step 3: Try setting invalid values (null name, age outside range, negative salary)
        // and see if your validation works
        emp1.setName(null);
        emp1.setAge(10);
        emp2.setSalary(-100);
        
        System.out.println("Informations after setting wrong params");
        emp1.display();
        emp2.display();

        // Step 4: Give both employees a 10% raise and display their details again
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("Informations after raise");
        emp1.display();
        emp2.display();

        // Step 5: Clone the first employee and display the cloned employee details
        // Hint: Use try-catch block to handle CloneNotSupportedException
        // Employee clonedEmployee = (Employee) employee1.clone();
        Employee clonedEmployee = null;
        try {
            clonedEmployee = (Employee) emp1.clone();

            // Step 6: Modify the original employee and verify that the clone remains unchanged
            // This demonstrates that cloning creates a separate object
            emp1.setSalary(200);

            System.out.println("Employee 1 that is cloned and modified after cloning");
            emp1.display();

            System.out.println("Informations about cloned employee");
            clonedEmployee.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Not supported!");
        }
        
        // Step 7: Create a method that compares the salaries of two employees
        // and returns the name of the employee with the higher salary
        // If salaries are equal, return "Equal salaries"
        System.out.println("Employee with higher salary is: " + compareSalaries(emp1, emp2));
    }
}