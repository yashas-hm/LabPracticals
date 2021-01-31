package Lab7.Employee;

import java.util.Scanner;

public class Employee {
    private String name;
    private char gender;
    private int emp_numb;

    public void input_data(Scanner input) {
        System.out.print("Enter Name            : ");
        name = input.nextLine();
        System.out.print("Enter Employee Number : ");
        emp_numb = input.nextInt();
        System.out.print("Enter Gender (M/F)    : ");
        gender = input.next().charAt(0);
    }

    public void show_data() {
        System.out.println("Name of Employee : " + name);
        System.out.println("Employee code    : " + emp_numb);
        if (Character.toUpperCase(gender) == 'M') {
            System.out.println("Employee gender  : Male ");
        } else {
            System.out.println("Employee gender  : Female ");
        }
    }

    public char get_gender() {
        return gender;
    }
}
