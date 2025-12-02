class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method of :"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinX
{
    public static void main(String A[]) throws InterruptedException
    {
          System.out.println("Inside Mian thread");
          Demo dobj1 =  new Demo();        
          Demo dobj2 =  new Demo();

          dobj1.setName("First");
          dobj2.setName("Second");

          dobj1.start();                   
          dobj2.start();

          dobj1.join();        //main thread goes to in wait state for join the thread
          dobj2.join();
          System.out.println("End of main thread");

    }
}