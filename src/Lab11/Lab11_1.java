package Lab11;

//Write the program that demonstrate the use of Stack, Vector and ArrayList classes

import java.util.*;

public class Lab11_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            vector.add(i);
            arrayList.add(i);
        }
        System.out.println("Original stack : "+ stack);
        System.out.println("Original stack : "+ vector);
        System.out.println("Original stack : "+ arrayList);
        stack.pop();
        System.out.println("Stack after removing 1 element                  : "+ stack);
        vector.remove(3);
        System.out.println("Vector after removing element at position 3     : "+ vector);
        arrayList.remove(4);
        System.out.println("Array List after removing element at position 4 : "+ arrayList);
        input.close();
    }
}
