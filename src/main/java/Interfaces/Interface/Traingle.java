package main.java.Interfaces.Interface;

public class Traingle implements First_Interface, Second_Interface {
    public double Area(int b, int h) {
        return (0.5 * b * h);
    }

    public int Perimeter(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Traingle t = new Traingle();
        System.out.println("Area of triangle: " + t.Area(4, 5));
        System.out.println("Perimeter of Triangle: " + t.Perimeter(2,3,4));
    }

}