import java.io.*;
class PriorityDemo extends Thread
{
       String name;
	PriorityDemo(String s)
	   {	
		name=s;
	   }
	public void run()
              {
	try{
		for(int i=1;i<=3;i++)
		System.out.println("thread "+name);
	Thread.sleep(1000);
		}
catch(Exception e){
System.out.println(e);
                               }
          }
}
class MainPriority
{
    public static void main(String args[])
      {
	PriorityDemo m1=new PriorityDemo("A");
	PriorityDemo m2=new PriorityDemo("B");
	PriorityDemo m3=new PriorityDemo("C");	
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(10);	
	System.out.println("Priority of A thread:"+m1.getPriority());
	System.out.println("Priority of B thread:"+m2.getPriority());
	System.out.println("Priority of C thread:"+m3.getPriority());
	     m1.start(); 
	     m2.start();
	     m3.start();
	Thread t=Thread.currentThread();
	System.out.println("Thread name  "+t.getName());
	
      }
}
