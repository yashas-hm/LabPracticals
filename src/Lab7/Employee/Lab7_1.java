package Lab7.Employee;

/*
        Create a package “employee” and define a Class Employee having three data
        members, name, emp_num, and gender and two methods- input_data and
        show_data. Inherit class SalariedEmployee from this class and keep it in
        package “employee”. Add new variable salary and methods allowance (if female
        hra=0.1* salary else 0.09* salary. DA= 0.05*salary) and increment (salary=
        salary+0.01 * salary). Calculate gross salary in main class defined in the same
        package.
 */

public class Lab7_1 {
    public static void main(String[] args){
        SalariedEmployee e1 = new SalariedEmployee();
        double[] extras = e1.allowance();
        double increment = e1.increment();
        double salary = e1.getSalary();
        e1.displayData();
        System.out.println("Gross Salary     : " + (salary + increment + extras[0] + extras[1]));
    }
}
