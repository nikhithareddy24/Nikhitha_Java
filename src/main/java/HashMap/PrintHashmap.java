package main.java.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintHashmap {
    public static void main (String args[])
    {
        Student S1 = new Student("Raj","jab", 3.5);
        Student S2 =  new Student("teju","m",4.0);
        Student S3 = new Student("Pooja","k",4.0);
        Student S4 = new Student("Jack","S",3.0);
        Student S5 = new Student("sam","t",3.5);
        Student S6 = new Student("ram","gr",3.7);
        Student S7 = new Student("Candy","S",3.5);
        Student S8 = new Student("tom","h",3.0);




        HashMap<String,Student> students = new HashMap<>();

        students.put(S1.getFirstName(),S1);
        students.put(S2.getFirstName(),S2);
        students.put(S3.getFirstName(),S3);
        students.put(S4.getFirstName(),S4);
        students.put(S5.getFirstName(),S5);
        students.put(S6.getFirstName(),S6);
        students.put(S7.getFirstName(),S7);
        students.put(S8.getFirstName(),S8);

        System.out.println("\nUsing EntrySet!");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            String firstName = entry.getKey();
            Student student = (Student) entry.getValue();
            System.out.println("First Name: " + firstName + ", Last Name: " + student.getLastName() + ", GPA: " + student.getGPA());
        }

        System.out.println("\nUsing forEach! ");
        students.forEach((firstName, student1) -> System.out.println("First Name: " + firstName + ", LastName: " + student1.getLastName() + ", GPA: " + student1.getGPA()));

        System.out.println("\nUsing Iterator");
        Iterator<Map.Entry<String, Student>> itr = students.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, Student> obj= itr.next();
            String firstName = obj.getKey();
            Student student2 = (Student) obj.getValue();
            System.out.println("First Name: " + firstName + ", Last Name: " + student2.getLastName() + ", GPA: " + student2.getGPA());
        }
    }
}