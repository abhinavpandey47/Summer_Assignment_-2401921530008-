interface Test {
    void square(int n);
}

class Arithmetic implements Test {
    public void square(int n) {
        System.out.println("Square of " + n + " = " + (n * n));
    }
}

class ToTestInt {
    void run() {
        Arithmetic a = new Arithmetic();
        a.square(5);
    }
}

class Outer {
    void display() {
        System.out.println("Outer class display");
    }
    
    class Inner {
        void display() {
            System.out.println("Inner class display");
        }
    }
}

class Point {
    private int x, y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

class Box {
    protected double length, breadth;
    
    public Box(double length, double breadth) {
        this.length  = length;
        this.breadth = breadth;
    }
    
    public double area() {
        return length * breadth;
    }
}

class Box3D extends Box {
    private double height;
    
    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }
    
    public double volume() {
        return length * breadth * height;
    }
}

public class Main {
    public static void main(String[] args) {
        ToTestInt t = new ToTestInt();
        t.run();
        
        Outer o = new Outer();
        o.display();
        Outer.Inner i = o.new Inner();
        i.display();
        
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        p1.setXY(1, 2);
        p1.display();
        p2.display();
        
        Box b = new Box(5, 3);
        System.out.println("Area   = " + b.area());
        Box3D b3 = new Box3D(5, 3, 2);
        System.out.println("Area   = " + b3.area());
        System.out.println("Volume = " + b3.volume());
    }
}