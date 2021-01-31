package Lab8;

/*
        WAP using try catch block. User should enter two command line arguments.
        If only one argument is entered then exception should be caught. In case of two
        command line arguments, if fist is divided by second and if second command
        line argument is 0 then catch the appropriate exception.
*/

import java.util.Scanner;

public class Lab8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter number 1 : ");
        a = input.nextInt();
        System.out.print("Enter number 2 : ");
        b = input.nextInt();
        try {
            System.out.println(a / b);
        } catch (Exception m) {
            System.out.println("Exception is : " + m);
        }
        input.close();
    }
}

