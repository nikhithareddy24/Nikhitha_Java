package main.java.HashMap;

import java.util.HashMap;

public class ArrayTargetSum {

    public static void TargetSum(int[] arr) {
        int target = 100;

        HashMap<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (indices.containsKey(complement)) {
                int complementIndex = indices.get(complement);
                System.out.println("Indices: " + complementIndex + ", " + i);
                System.out.println("Values: " + complement + ", " + arr[i]);
            }

            indices.put(arr[i], i);
        }
    }

    public static void main(String args[]) {
        int[] arr1 = {10,20,30,40,50,60};
        TargetSum(arr1);
    }
}