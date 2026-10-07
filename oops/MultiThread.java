import java.io.*;
class MyThread1 extends Thread
{
    String name;
	MyThread1(String s)
	   {	
		name=s;
	   }
	public void run()
    {
	try{
		for(int i=1;i<=5;i++)
		System.out.println("thread "+name);
	Thread.sleep(90000);
	}
catch(Exception e){
System.out.println(e);
}
}
}
class MultiThread
{
    public static void main(String args[])
    {
	MyThread1 m1=new MyThread1("A");
	MyThread1 m2=new MyThread1("B");
	MyThread1 m3=new MyThread1("C");
	    m1.start(); 
   	 	m2.start();
	    m3.start();
	
	}
}
