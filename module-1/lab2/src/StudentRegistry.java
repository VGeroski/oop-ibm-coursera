// StudentRegistry class to test the Student class
public class StudentRegistry {

    public static String compareGrades(Student first, Student second) {
        if (first.getGrade() > second.getGrade()) return first.getName();
        if (second.getGrade() > first.getGrade()) return second.getName();
        return "Equal grades";
    }

    public static void main(String[] args) {
        // Step 1: Create two instances of the Student class
        Student std1 = new Student();
        Student std2 = new Student();
        
        // Step 2: Use setter methods to set values for all attributes of first student
        // Example values: ID "S001", name "John Doe", grade 85.5, active true
        std1.setStudentId("S001");
        std1.setName("John Doe");
        std1.setGrade(85.5);
        std1.setActive(true);
        
        // Step 3: Set values for second student
        // Example values: ID "S002", name "Jane Smith", grade 92.0, active true
        std2.setStudentId("S002");
        std2.setName("Jane Smith");
        std2.setGrade(92.0);
        std2.setActive(true);
        
        // Step 4: Display details of both students
        std1.display();
        std2.display();
        
        // Step 5: Compare the grades of the two students and print who has the higher grade
        // Hint: Create a separate method for this comparison
        System.out.println("Higher grades has " + compareGrades(std1, std2));
        
        // Step 6: Test the letter grade method for both students
        System.out.println("Letter grade for student " + std1.getName() + " is " + std1.getLetterGrade());
        System.out.println("Letter grade for student " + std2.getName() + " is " + std2.getLetterGrade());
        
        // Step 7: Test the passing status method for both students
        System.out.println("Student " + std1.getName() + " is " + (std1.isPassing() ? "" : "not ") + "passing");
        System.out.println("Student " + std2.getName() + " is " + (std2.isPassing() ? "" : "not ") + "passing");
        
        // Step 8: Change one student to inactive and display the updated information
        std1.setActive(false);
        std1.setGrade(55);
        System.out.println("Student " + std1.getName() + " is " + (std1.isPassing() ? "" : "not ") + "passing");

        std1.display();
    }
}
