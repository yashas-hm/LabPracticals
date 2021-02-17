package Lab5;

/*
        WAP that illustrates method overriding. Class A3 is extended by Class B3.
        Each of these classes defines a hello(string s) method that outputs the string “A3:
        Hello From” or “B3: Hello From” respectively. Use the concept Dynamic
        Method Dispatch and keyword super.
*/

public class Lab5_2 {
    public static void main(String[] args) {
        A3 b = new B3();
        A3 a = new A3();
        a.hello();
        b.hello();
    }
}

class A3 {
    public void hello() {
        System.out.println( "A3 : Hello From");
    }
}

class B3 extends A3 {
    @Override
    public void hello() {
        System.out.println("B3 : Hello From");
    }
}
