package Lab7.Employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
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
        return (salary + (salary * 0.01));
    }

    public double getSalary() {
        return salary;
    }

    public void displayData() {
        double[] extras = allowance();
        double increment = increment();
        super.show_data();
        System.out.println("Base salary      : " + salary);
        System.out.println("Increment        : " + increment);
        System.out.println("HRA              : " + extras[0]);
        System.out.println("DA               : " + extras[1]);
        System.out.println();
    }
}
