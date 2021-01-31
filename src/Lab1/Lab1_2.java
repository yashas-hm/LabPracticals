package Lab1;

//Write a program to find whether the number is prime or not

import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        if(isPrime(number)){
            System.out.println(number+" is a Prime Number");
        }else{
            System.out.println(number+" is not a Prime Number");
        }
        input.close();
    }

    static boolean isPrime(int a) {

        boolean check = true;

        if(a<=1){
            return false;
        }

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                check = false;
                break;
            }
        }

        return check;
    }
}
