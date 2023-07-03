package main.java.Functions;

import java.util.*;
public class age
{
        void checkAge(int Age)
        {
          if(Age>=13&Age<=19){
              System.out.println("Teen");
        }
          else if(Age>0&Age<13)
          {
              System.out.println("kid");
          }
          else if(Age>19)
          {
              System.out.println("Adult");
          }
          else
          {
              System.out.println("Entered Age is wrong! Please enter a valid value");
          }

    }
    public static void main(String[] args)
    {
        age a = new age();
     System.out.println("Enter Age: ");
     Scanner sc = new Scanner(System.in);
     int b=sc.nextInt();
     a.checkAge(b);
    }
}
