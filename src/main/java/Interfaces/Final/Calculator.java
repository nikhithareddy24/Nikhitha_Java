package main.java.Interfaces.Final;

final class Calculator {
    protected final int number1=10;
    int number2;


    protected final int add(int number2) {
        this.number2 = number2;
        return number1 + number2;
    }


    public static void main(String[] args)
    {
        Calculator c = new Calculator();
       System.out.println("Addition of Number1 and Number 2 is : "+c.add(5));

    }
}
