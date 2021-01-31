package Lab8;

/*
        Define an exception called “NoMatchException” that is thrown when a string
        is not equal to “India”. Write a program that uses this exception.
*/

import java.util.Scanner;

public class Lab8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Enter a string : ");
        str = input.next();
        try {
            if (str.compareTo("India") != 0) {
                throw new NoMatchException("Not equal");
            } else {
                System.out.println(str);
            }
        } catch (NoMatchException e) {
            e.printStackTrace();
        }
    }
}

class NoMatchException extends Exception {
    NoMatchException(String str) {
        super(str);
    }
}