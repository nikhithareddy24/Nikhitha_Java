package main.java.Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        String name2;
        String name1[];
        String result="";
        char n=' ';
        name1 = name.split(" ");
        for(int i=0;i<=name1.length-1;i++)
        {
            name2=name1[i];
            for(int j=0;j<=name2.length()-1;j++) {
                n = name2.charAt(j);
                result = n+result;
            }
            System.out.print(result+"");
            result=" ";
        }
    }
}


