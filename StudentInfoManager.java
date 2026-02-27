import java.util.*;
public class StudentInfoManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students to add: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            System.out.print("Enter Blood Group:");
            String bloodGroup = sc.nextLine();
            System.out.print("Enter Skill: ");
            String skill = sc.nextLine();
            System.out.print("Enter Languages Known: ");
            String language = sc.nextLine();
            System.out.print("Enter School Name: ");
            String school = sc.nextLine();
            System.out.print("Enter Hobby: ");
            String hobby = sc.nextLine();
            System.out.print("Enter Phone Number: ");
            long phone = sc.nextLong();
            sc.nextLine();
            students[i] = new Student(id, name, age, department, bloodGroup, skill, language, school, hobby, phone);
        }
        System.out.println("\n--- All Student Details ---");
        for (Student s : students) {
            s.display();
        }
        sc.close();
    }
}
class Student {
    int id;
    String name;
    int age;
    String department;
    String bloodGroup;
    String skill;
    String language;
    String school;
    String hobby;
    long phone;
    Student(int id, String name, int age, String department, String bloodGroup,
            String skill, String language, String school, String hobby, long phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.bloodGroup = bloodGroup;
        this.skill = skill;
        this.language = language;
        this.school = school;
        this.hobby = hobby;
        this.phone = phone;
    }
    void display() {
        System.out.println("\nStudent ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Department: " + this.department);
        System.out.println("Blood Group: " + this.bloodGroup);
        System.out.println("Skill: " + this.skill);
        System.out.println("Languages Known: " + this.language);
        System.out.println("School: " + this.school);
        System.out.println("Hobby: " + this.hobby);
        System.out.println("Phone Number: " + this.phone);
    }
} 
