package com.sunbeam;
import java.util.*;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n----- Student Management Menu -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            // Check if there's a nextInt; avoids exception if user types something invalid
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // consume invalid input
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine(); // consume the leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    students.add(new Student(rollNo, name, marks));
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    Iterator<Student> iterator = students.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRollNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    boolean found = false;
                    for (Student s : students) {
                        if (s.rollNo == searchRollNo) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    students.sort(Comparator.comparingInt(s -> s.rollNo));
                    System.out.println("Students sorted by Roll No.");
                    break;

                case 5:
                    students.sort(Comparator.comparing(s -> s.name.toLowerCase()));
                    System.out.println("Students sorted by Name.");
                    break;

                case 6:
                    students.sort(Comparator.comparingDouble(s -> s.marks));
                    System.out.println("Students sorted by Marks.");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
