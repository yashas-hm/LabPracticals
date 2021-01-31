package Lab1;

//Write a program to print the Fibonacci series

import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args){
        int size, previous = 0, now = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number till which to display fibonacci series : ");
        size = input.nextInt();

        while (previous <= size) {
            System.out.print(previous + " ");
            int next = previous + now;
            previous = now;
            now = next;
        }

        input.close();
    }
}
