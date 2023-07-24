import java.util.Scanner;

public class Students {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student(1, "Meet");

    }
}

class Student {
    int roll_no;
    String name;

    Student(int roll_no, String name) {

        System.out.println("Student Roll No. =" + roll_no);
        System.out.println("Student Name =" + name);

    }
}