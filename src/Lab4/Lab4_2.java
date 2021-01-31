package Lab4;

/*      The employee list for a company contains employee code, name, designation
        and basic pay. The employee is given HRA of 10% of the basic and DA of 45%
        of the basic pay. The total pay of the employee is calculated as Basic
        pay+HRA+ DA. Write a class to define the details of the employee. Write a
        constructor to assign the required initial values. Add a method to calculate HRA,
        DA and Total pay and print them out. Write another class with a main method.
        Create objects for three different employees and calculate the HRA, DA and
        total pay.
 */

import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee e1 = new Employee(input), e2 = new Employee(input), e3 = new Employee(input);
        e1.showData();
        e2.showData();
        e3.showData();
        input.close();
    }
}

class Employee {
    private final int code;
    private final double basicPay;
    private final String name;
    private final String designation;

    Employee(Scanner input) {
        System.out.println();
        System.out.print("Enter employee code         : ");
        code = input.nextInt();
        System.out.print("Enter employee name         : ");
        name = input.next();
        System.out.print("Enter basic pay of employee : ");
        basicPay = input.nextDouble();
        System.out.print("Enter employee designation  : ");
        designation = input.next();
    }

    public void showData() {
        System.out.println("Employee Code         : " + code);
        System.out.println("Employee Name         : " + name);
        System.out.println("Employee Designation  : " + designation);
        System.out.println("Basic Pay of Employee : " + basicPay);
        System.out.println("HRA                   : " + (0.1 * basicPay));
        System.out.println("DA                    : " + (0.45 * basicPay));
        System.out.println("Total Pay             : " + ((0.1 * basicPay) + (0.45 * basicPay) + basicPay));
        System.out.println();
    }
}
