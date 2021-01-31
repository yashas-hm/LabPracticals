package Lab2;

//Write a program to find the average of n numbers stored in an Array

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        int[] arr;
        int size;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        size = input.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
               System.out.print("Enter number "+(i+1)+" : ");
               arr[i] = input.nextInt();
               sum += arr[i];
        }

        System.out.println("Original array : "+ Arrays.toString(arr));
        System.out.println("Average of array elements is : "+(sum/arr.length));
        input.close();
    }
}
