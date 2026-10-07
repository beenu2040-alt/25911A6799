class ThreadDemo1 extends Thread
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
class ThreadTest
{
    public static void main(String args[])
      {
	ThreadDemo1 t=new ThreadDemo1();
	t.start();  //call start method to run thread
	System.out.println("end of main thread");
      }
}
