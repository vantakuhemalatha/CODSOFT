import java.util.*;
public class task2 {
    public static void StudentGradeCalculator() {
        int count, i;
        float sum = 0;
        float percentage;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of subjects");
            count = sc.nextInt();
            if (count <= 0) {
                System.out.println("Invalid number of subjects");
                return;
            }
        System.out.println("Enter marks for " + count + " subjects:");
            for (i = 0; i < count; i++) {
                sum += sc.nextFloat();
            }
        }
        System.out.println("Sum of all subjects: " + sum);
        percentage = (sum / (count * 100)) * 100;
        System.out.println("percentage of a student:" +percentage);
        String grade = "";
        if (percentage >= 95) grade = "A+";
        else if (percentage >= 90) grade = "A";
        else if (percentage >= 85) grade = "B";
        else if (percentage >= 80) grade = "C";
        else if (percentage >= 70) grade = "D";
        else if (percentage >= 60) grade = "E";
        else if (percentage >= 50) grade = "F";
     System.out.println("\nGrade: " + grade);
    }
     public static void main(String[] args) {
        StudentGradeCalculator();
    }
}