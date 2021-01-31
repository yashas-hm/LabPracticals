package Lab13;

import java.util.Scanner;

public class Lab13_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str;
        char search;
        int count=0;
        System.out.print("Enter string : ");
        str = input.nextLine();
        System.out.print("Enter char to search : ");
        search = input.next().charAt(0);
        for(int i =0 ;i<str.length();i++){
            if(Character.toLowerCase(str.charAt(i))==Character.toLowerCase(search)){
                count++;
            }
        }
        System.out.println(search+" occurred "+count+" times in "+str);
        input.close();
    }
}
