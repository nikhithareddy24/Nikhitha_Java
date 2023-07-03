package main.java.Strings;

import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args) {
        System.out.println("Enter First String: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Enter Second String: ");
        Scanner sc1 = new Scanner(System.in);
        String s2 = sc1.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("Arrays are not of equal length so need not check for anagram");
        }
        else {
            char arr1[] = s1.toCharArray();
            char arr2[] = s2.toCharArray();
            char temp, temp1;
            for (int i = 0; i <= arr1.length - 1; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] > arr1[j]) {
                        temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            String String1 = String.valueOf(arr1);
            System.out.println("Sorted first word: " + String1);
            for (int k = 0; k <= arr2.length - 1; k++) {
                for (int l = k + 1; l < arr2.length; l++) {
                    if (arr2[k] > arr2[l]) {
                        temp = arr2[k];
                        arr2[k] = arr2[l];
                        arr2[l] = temp;
                    }
                }
            }
            String String2 = String.valueOf(arr2);
            System.out.println("Sorted Second String: " + String2);
            if (String1.equalsIgnoreCase(String2))
                System.out.println("Two Strings are Anagram");
            else
                System.out.println("Two Strings are not anagram");
        }
    }

}
