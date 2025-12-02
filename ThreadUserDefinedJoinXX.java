class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method of :"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinXX
{
    public static void main(String A[]) 
    {
          System.out.println("Inside Mian thread");
          Demo dobj1 =  new Demo();        
          Demo dobj2 =  new Demo();

          dobj1.setName("First");
          dobj2.setName("Second");

          dobj1.start();                   
          dobj2.start();
          
          // Checked Exception
          try
          {
             dobj1.join();        //main thread goes to in wait state for join the thread
             dobj2.join();        // join  method use for thread syncronization(talmel)
          }

          catch(InterruptedException iobj)
          {

          }
          System.out.println("End of main thread");

    }
}