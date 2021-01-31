package Lab4;

/*      a) WAP that declares a class named Person. It should have instance variables to
        record name, age and salary. Use new operator to create a Lab4.Person object. Set and
        display its instance variables.
        b) Add a constructor to the Person class developed above.
 */

import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args) {
        Person p1 = new Person(), p2 = new Person("Tony", 30, 40000);
        p1.displayData();
        p1.setData();
        p1.displayData();
        p2.displayData();
    }
}

class Person {
    String name;
    int age;
    double salary;

    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    Person() {
        name = "Dummy";
        age = 0;
        salary = 0;
    }

    public void setData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name   : ");
        name = input.next();
        System.out.print("Enter Age    : ");
        age = input.nextInt();
        System.out.print("Enter Salary : ");
        salary = input.nextDouble();
        input.close();
    }

    public void displayData() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}
