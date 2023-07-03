package main.java.Threads;

public class RunnableInterface implements Runnable
{
    public void run()
    {
      for(int i=1;i<=10;i++)
      {
          System.out.println(i);
      }
    }
    public static void main(String[] args)
    {
        RunnableInterface p2 = new RunnableInterface();
        Thread t1 = new Thread(p2);
        t1.start();
    }
}
