package main.java.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLastObject {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("A", "c", "d", "e"));
        int lastIndex = names.size()-1;
        names.remove(lastIndex);
        System.out.println(names);
    }
}

