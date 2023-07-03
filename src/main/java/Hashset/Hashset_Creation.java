package main.java.Hashset;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset_Creation
{
    public static void main(String[] args)
    {
        HashSet<String> names = new HashSet<String>();
        names.add("raj");
        names.add("Tom");
        names.add("Sam");
        names.add("Jack");
        names.add("Albert");
        names.add("Anu");
        names.add("Niha");
        names.add("Divi");
        names.add("Martin");
        names.add("George");
        System.out.println(names);
        Iterator <String> itr = names.iterator();
        System.out.println("Printing names using iterator: ");
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println("\n"+"printing names using ForEach Loop: ");
        names.forEach(name->System.out.print(name+" "));
        System.out.println("\n"+"Printing names using Streams ForEach is: ");
        names.stream().forEach(name->System.out.print(name+" "));
    }
}
