package main.java.LambdasnStreams;

import java.util.Arrays;

public class Vowels
{
    public static void main(String[] args)
    {
        String[] strArray = {"tejaswi", "hello", "hi ", "dbc", "njk"};

        Arrays.stream(strArray)
                .filter(s -> s.matches(".*[aeiouAEIOU].*"))
                .forEach(s -> {
                    long vowelCount = s.chars()
                            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                            .count();
                    System.out.println(s + " (Number of vowels: " + vowelCount + ")");
                });

    }
    }

