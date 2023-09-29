import java.util.Scanner;

public class Student_grade_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total number of marks: ");
        int totalMarks = scanner.nextInt();
        
        System.out.print("Enter the obtained marks: ");
        int obtainedMarks = scanner.nextInt();
        
        double percentage = (obtainedMarks * 100.0) / totalMarks;
        
        System.out.println("Percentage: " + percentage + "%");
        
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        scanner.close();
    }
}
