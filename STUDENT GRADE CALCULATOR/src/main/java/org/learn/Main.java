package org.learn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSubjects = 5;
        int total = 0;

        System.out.println("Enter marks for 5 subjects (out of 100):");

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject " + i + " marks: ");
            int m = sc.nextInt();
            total += m;
        }

        double avg = (total / (double) numSubjects);

        String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nResult:");
        System.out.println("Total Marks: " + total + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage: " + avg + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
