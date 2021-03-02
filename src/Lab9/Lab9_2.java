package Lab9;


/*
    Write the thread program -1using Runnable interface.
 */


public class Lab9_2 {
    public static void main(String[] args) {
        X x = new X();
        Thread t1 = new Thread(x);
        Y y = new Y();
        Thread t2 = new Thread(y);
        Z z = new Z();
        Thread t3 = new Thread(z);
        t1.start();
        t2.start();
        t3.start();
    }
}

class X implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("a ");
        }
    }
}

class Y implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("b ");
        }
    }
}

class Z implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("c ");
        }
    }
}
