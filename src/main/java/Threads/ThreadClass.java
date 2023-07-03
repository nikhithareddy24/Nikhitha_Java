package main.java.Threads;

public class ThreadClass extends Thread {
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("first thread: "+i);
        }
    }
}
     class p2 extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("second thread: "+i);
            }
        }
            public static void main (String[]args)
            {
                ThreadClass p1 = new ThreadClass();
                p2 p= new p2();
                p1.start();
                p.start();
            }
        }

