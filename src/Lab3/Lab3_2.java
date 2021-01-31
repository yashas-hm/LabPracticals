package Lab3;

//WAP that to sort given strings into alphabetical order.

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strArr;
        int size;
        System.out.print("Enter number of strings to enter : ");
        size = input.nextInt();
        strArr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter string " + (i + 1) + " : ");
            strArr[i] = input.next();
        }
        System.out.println("Original Array : \n" + Arrays.toString(strArr));
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareTo(strArr[j]) > 0) {
                    String strTemp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = strTemp;
                }
            }
        }
        System.out.println("Sorted Array : \n" + Arrays.toString(strArr));
        input.close();
    }
}
