import java.util.ArrayList;
import java.util.Scanner;       // Scanner = “data ko read karne wala tool”

class Student {

    String name;
    int marks1;
    int marks2;
    int marks3;

    int total;
    double average;
    char grade;


    // Constructor
    Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;                           // Without this: 👉 Both sides become parameter only
        this.marks2 = marks2;               // this is used to differentiate instance variables from parameters
        this.marks3 = marks3;

        calculateTotal();
        calculateAverage();
        calculateGrade();
    }


    void calculateTotal() {
        total = marks1 + marks2 + marks3;
    }

    void calculateAverage() {
        average = total / 3.0;
    }

    void calculateGrade() {
        if (average >= 75) {
            grade = 'A';
        } else if ( average >= 50 ) {
            grade = 'B';
        } else {
            grade = 'C';
        }
    }

}


public class StudentManager {
    public static void main(String[] args) {
        

        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");              // number input
        int n = sc.nextInt();
        sc.nextLine();                          // important (fix newline issue)


        for (int i = 0; i < n; i++) {         // loop

            System.out.println("\nEnter details for student " + (i + 1));

            System.out.println("Enter name: ");                 // Input
            String name = sc.nextLine();

            System.out.println("Enter marks 1: ");
            int m1 = sc.nextInt();
            
            System.out.println("Enter marks 2: ");
            int m2 = sc.nextInt();

            System.out.println("Enter marks 3: ");
            int m3 = sc.nextInt();

            sc.nextLine();              // clear buffer


            Student s = new Student(name, m1, m2, m3);         // Object creation
            students.add(s);                                     // Add to list

        }

            
        System.out.println("\n--- All Students Details ---");


        for(Student s: students) {                     // loop to print        print all

            System.out.println();
            System.out.println("Name: " + s.name);
            System.out.println("Total: " + s.total);
            System.out.println("Average: " + s.average);
            System.out.println("Grade: " + s.grade);

        }

    }
}