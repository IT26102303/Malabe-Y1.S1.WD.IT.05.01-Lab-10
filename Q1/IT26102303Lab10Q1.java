import java.util.Scanner;

public class IT26102303Lab10Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for marks
        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        // Validate that the mark is between 0 and 100
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
        System.out.println("Mark is Validated");

        // Figure out the letter grade based on the mark
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Double check that the grade assignment logic worked properly
        assert ((mark >= 75 && grade == 'A') ||
                (mark >= 60 && mark < 75 && grade == 'B') ||
                (mark >= 50 && mark < 60 && grade == 'C') ||
                (mark >= 40 && mark < 50 && grade == 'D') ||
                (mark < 40 && grade == 'F')) : "Incorrect Grade Assigned";

        // Print out the final result
        System.out.println("The Grade for the Entered Mark is: " + grade);
        
    }
}
