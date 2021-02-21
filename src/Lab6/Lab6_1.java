package Lab6;

/*
    Write an abstract class shape, which defines abstract method area.
    Derive class circle from shape. It has data member radius and implementation for area
    function. Derive class Triangle from shape. It has data members height, base and
    implementation for area function. Derive class Square from shape. It has data
    member side and implementation for area function. In main class, use dynamic
    method dispatch in order to call correct version of method.
*/


public class Lab6_1 {
    public static void main(String[] args){
        Square s = new Square(10);
        Triangle t = new Triangle(10,10);
        Circle c = new Circle(10);

        s.area();
        t.area();
        c.area();
    }
}

abstract class Shape {
    public abstract void area();
}

class Circle extends Shape{
    private final int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle of radius "+radius+" is : "+(3.14*radius*radius));
    }
}

class Triangle extends Shape{
    private final int height;
    private final int base;

    public Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }


    @Override
    public void area() {
        System.out.println("Area of triangle of height "+height+" and base "+base+" is : "+(0.5*base*height));
    }
}


class Square extends Shape{
    private final int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("Area of square of side "+side+" is : "+(side*side));
    }
}

