package Lab3;

/*      Create a String Buffer with some default string.
        Append any string to ith position of original string and
        display the modified string.Also display the
        reverse of modified string.
 */

import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int position;
        StringBuffer stringBuffer;
        stringBuffer = new StringBuffer("Dummy String");
        System.out.println("Original text : " + stringBuffer);
        System.out.print("Enter string to add to dummy string : ");
        str = input.nextLine();
        System.out.print("Enter position to add string : ");
        position = input.nextInt();
        stringBuffer.insert(position, str);
        System.out.println("Modified string : " + stringBuffer);
        System.out.println("Reversed string : " + stringBuffer.reverse());
        input.close();
    }
}
