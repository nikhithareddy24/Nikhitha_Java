package main.java.Arrays;
public class RotationArray {
    public static void main(String args[]) {
        int a[] = new int[]{1,2,3,4,5,6,7};
        int i,j;
        int shift=2;
        System.out.println("Original Array:");
        for(i=0;i<a.length;i++) {
            System.out.print(a[i] );
        }
        for(i=0;i<shift;i++)
        {
            int temp=a[0];
            for(j=0;j<a.length-1;j++)
            {
                a[j] = a[j+1];
            }
            a[a.length-1]=temp;
        }
        System.out.println("\nRotated Array:");
        for(i=0;i<a.length;i++) {
            System.out.print(a[i] );
        }
    }
}