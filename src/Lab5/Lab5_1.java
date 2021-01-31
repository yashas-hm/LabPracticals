package Lab5;

/*      Write a program which defines base class Lab4.Employee having three data
        members, namely name[30], emp_numb and gender and two methods namely
        input_data() and show_data(). Derive a class Lab5.SalariedEmployee from Employee
        and adds a new data member, namely salary. It also adds two member methods,
        namely allowance (if gender is female HRA=0.1 *salary else 0.09* salary. DA=
        0.05*salary) and increment (salary= salary+0.1*salary). Display the gross salary
        in main class. (Tip: Use super to call base class’s constructor).
 */

import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        SalariedEmployee e1 = new SalariedEmployee();
        e1.displayData();
    }
}

class Employee {
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

class SalariedEmployee extends Employee {
    private final double salary;

    SalariedEmployee() {
        Scanner input = new Scanner(System.in);
        super.input_data(input);
        System.out.print("Enter salary          : ");
        salary = input.nextDouble();
        input.close();
    }

    public double[] allowance() {
        char gender = Character.toUpperCase(super.get_gender());
        double[] extras = new double[2];
        if (gender == 'M') {
            extras[0] = 0.09 * salary;
        } else {
            extras[0] = 0.1 * salary;
        }
        extras[1] = 0.05 * salary;
        return extras;
    }

    public double increment() {
        return (salary + (salary * 0.1));
    }

    public void displayData() {
        double[] extras = allowance();
        double increment = increment();
        super.show_data();
        System.out.println("Base salary      : " + salary);
        System.out.println("Increment        : " + increment);
        System.out.println("HRA              : " + extras[0]);
        System.out.println("DA               : " + extras[1]);
        System.out.println("Gross Salary     : " + (salary + increment + extras[0] + extras[1]));
        System.out.println();
    }
}
