class ThreadDemo implements Runnable 
{
    public void run()
     {
	for(int i=1;i<=10;i++)
	    {
	System.out.println("thread "+i);
	    }
System.out.println("end of thread");
     }
}
class RunnableTest
{
    public static void main(String args[])
      {
	ThreadDemo t=new ThreadDemo();
	Thread th=new Thread(t);  //creating thread by defining object
	th.start();  //call start method to run thread
	System.out.println("end of main thread");
      }
}
