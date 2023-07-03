package main.java.AbstractionandPolymorphism;

abstract class Department {

    abstract int getDepartmentSize();
}

class Dept extends Department {
    int size = 30;

    public int getDepartmentSize() {
        return size;
    }



    public static void main(String[] args) {
        Dept d = new Dept();
        System.out.println(d.getDepartmentSize());
    }
}










