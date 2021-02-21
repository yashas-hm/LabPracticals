package Lab6;

/*
    Create an interface Shape2D which declares a getArea() method.The
    abstract class Shape declares abstract display () method .Circle class is
    extended from shape class and implemented from shape2D interface. Write
    appropriate method required in class circle and Create instance of circle object
    and display area of circle
 */

public class Lab6_2 {
    public static void main(String[] args){
        Circle1 c = new Circle1(10);
        c.display();
    }
}

interface Shape2D{
    double getArea();
}

abstract class Shape1{
    abstract void display();
}

class Circle1 extends Shape1 implements Shape2D{
    private final int radius;

    public Circle1(int radius){
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("Area of circle of radius "+radius+" is : "+ getArea());
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
}
