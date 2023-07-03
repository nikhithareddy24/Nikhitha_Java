package main.java.Interfaces.Static;

public class Employee
{
    private static int Employee_number;

    public static int printNumber(int num)
    {
        int c=num+Employee_number;
        return c;
    }
    static
    {
        Employee_number=10;
    }
    public static void main( String[] args)
    {
        System.out.println("The Interfaces.Interfaces.Static.Employee number using static block is: "  +Employee.printNumber(5));
    }
}
