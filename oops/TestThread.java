import java.io.*;
class SyncThread
{
       	synchronized void call(String name)          //synchronized method
   	  {
		  for(int i=1;i<=5;i++)
	    	    {
	      		System.out.println("thread "+name);
	    	    }
              }
}
class MyThread extends Thread
{
   //SyncThread st=new SyncThread();
   	SyncThread st;
	String s;
	MyThread(SyncThread st1,String s1)
	{
		st=st1;
		s=s1;
	}
	public void run()
	{
	  st.call(s);
	
	}
}
class TestThread
{
    public static void main(String args[])
      {
	SyncThread st=new SyncThread();

	MyThread t=new MyThread(st,"hai");
	MyThread t1=new MyThread(st,"hello");
	MyThread t2=new MyThread(st,"welcome");
	t.start();  
	t1.start();
	t2.start();
      }
}
