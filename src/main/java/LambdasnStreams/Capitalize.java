package main.java.LambdasnStreams;
import java.util.*;
public class Capitalize
{
    public static void main(String[] args)
    {
        List<String> names= Arrays.asList("tejaswi","ramya","swathi");
        List<String> data= names.stream().sorted().toList();
        data.forEach(n->System.out.println(n.substring(0,1).toUpperCase()+n.substring(1).toLowerCase()));

    }
}
