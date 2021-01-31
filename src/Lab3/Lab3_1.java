package Lab3;

//WAP to replace substring with other substring in the given string.

import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str, replacedStr;
        char subStr, replaceWith;
        int position = -1;
        System.out.print("Enter String : ");
        str = input.nextLine();
        System.out.print("Enter substring to replace : ");
        subStr = input.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == subStr) {
                position = i;
                break;
            }
        }
        if (position == -1) {
            System.out.println("Substring not found");
            System.exit(-1);
        }
        System.out.print("Enter substring to replace with : ");
        replaceWith = input.next().charAt(0);
        replacedStr = str.substring(0, position) + replaceWith + str.substring(position + 1);
        System.out.println("Replaced string : " + replacedStr);
        input.close();
    }
}
