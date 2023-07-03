package main.java.Arrays;

public class Reversal
{
        static int array[] = {2,54,78,65,21,98,45,32};

        static void reverse() {
            System.out.println("Reversed Array");
            int newArr[] = new int[array.length];
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                newArr[j] = array[i];

            }
            for (int i = 0; i < newArr.length; i++)
                System.out.print(newArr[i] + " ");
            System.out.println("\n");
        }
        public static void main(String[] args){
            reverse();
        }
    }

