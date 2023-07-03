package main.java.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Traverse
{
    public static void main(String[] args)
    {
        List<String> names= Arrays.asList("tejaswi","ramya","swathi");
        System.out.println("Using For Loop:");
        for(int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i));
        }
        System.out.println("Using enhanced For Loop:");
        for (String s:names)
        {
            System.out.println(s+" ");
        }
        System.out.println("Using Iterator:");
        Iterator i = names.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next()+" ");
        }
        System.out.println("Using ForEach Loop:");
        names.forEach(name->System.out.println(name));
        System.out.println("Using Parllel Streams:");
        names.parallelStream().forEach(name ->
                System.out.println(name + " " + Thread.currentThread().getName())
        );

    }
}
