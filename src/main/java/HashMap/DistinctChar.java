package main.java.HashMap;

import java.util.HashMap;
import java.util.Map;

public class DistinctChar {

    public static void PrintDistinct(String str)
    {
        HashMap<Character,Integer> hm = new HashMap<>();

        for(char c: str.toCharArray()) {
//            int count = 0;
            int count = 0;
            if (hm.containsKey(c)) {
                count = hm.get(c);

                hm.put(c, count + 1);
            } else {
                hm.put(c, 1);
            }
        }



        for(Map.Entry<Character,Integer> entry : hm.entrySet())
        {
            char character = entry.getKey();
            int counter = entry.getValue();
            System.out.println("Character:"+ character + "\tcount is: " +counter);

        }

    }

    public static void main(String[] args) {

        String string = "occupation";

        PrintDistinct(string);

    }
}
