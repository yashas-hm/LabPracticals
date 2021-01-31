package Lab1;

/*Write a program to find a greater number among given three numbers using
        a) ternary operator
        b) nested if
*/

import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = takeInput(input);
        b = takeInput(input);
        c = takeInput(input);
        System.out.println("Using Ternary");
        System.out.println("Greatest number is : " + ternary(a, b, c));
        System.out.println("Using Nested If");
        System.out.println("Greatest number is : " + nestedIf(a, b, c));
        input.close();
    }

    static int takeInput(Scanner input) {
        System.out.print("Enter a number : ");
        return input.nextInt();
    }

    static int ternary(int a, int b, int c) {
        return c > (a >= b ? a : b) ? c : (a >= b) ? a : b;
    }

    static int nestedIf(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b >= c){
                return b;
            }else{
                return c;
            }
        }
    }
}
