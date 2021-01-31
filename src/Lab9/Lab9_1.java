package Lab9;

/*
        The program to creates and run the following three threads. The first thread
        prints the letter ‘a’ 100 times.
        The second thread prints the letter ‘b’ 100 times.
        The third thread prints the integer 1 to 100.
*/

public class Lab9_1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("a ");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("b ");
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("c ");
        }
    }
}


