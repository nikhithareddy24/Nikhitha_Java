package main.java.Functions;

public class FizzBuzz
{
    public void checkDivisibility(int number)
    {
        for(int i=1;i<=number;i++)
        {
            if (i % 3 == 0 &&i % 5 == 0)
            {
                System.out.print("FizBuzz"+"\t");
            }
            else if (i% 3 == 0)
            {
                System.out.print("Fizz"+"\t");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz"+"\t");
            }
            else {
                System.out.print(i+"\t");
            }

        }
    }
    public static void main(String[] args)
    {
        FizzBuzz fb = new FizzBuzz();
        fb.checkDivisibility(100);
    }
}
