package main.java.AbstractionandPolymorphism;

public class Student {
    String name = "Tejaswi";

    public String getName() {
        return name;
    }

    public String setName(String n) {
        return n;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("name before change is: "+s.getName());
        System.out.println("name after change is: "+s.setName("Teju"));

    }

}




