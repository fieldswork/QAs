package BranchTesting;
import java.util.Scanner;

public class GradeCalculator {

    private int totalBranches = 4;
    private int executedBranches = 0;
    private boolean branch1Executed = false;
    private boolean branch2Executed = false;
    private boolean branch3Executed = false;
    private boolean branch4Executed = false;

    public String calculateGrade(int score) {

        if (score >= 90) {              // Branch 1
            if (!branch1Executed) {
                branch1Executed = true;
                executedBranches++;
            }
            return "A :D";
        } 
        else if (score >= 80) {         // Branch 2
            if (!branch2Executed) {
                branch2Executed = true;
                executedBranches++;
            }
            return "B :)";
        } 
        else if (score >= 70) {         // Branch 3
            if (!branch3Executed) {
                branch3Executed = true;
                executedBranches++;
            }
            return "C :|";
        } 
        else {                          // Branch 4
            if (!branch4Executed) {
                branch4Executed = true;
                executedBranches++;
            }
            return "F :(";
        }

    }

    public void printCoverage() {
        double coverage = ((double) executedBranches / totalBranches) * 100;
        System.out.println("Branch Coverage: " + coverage + "%");
    }

    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter scores!"); // enter char to end
        while (scanner.hasNextInt()) {
            int score = scanner.nextInt();
            System.out.println("Grade: " + gc.calculateGrade(score));
        }
        
        gc.printCoverage();
        scanner.close();
    }
}
