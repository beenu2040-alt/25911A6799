class ThrowsDemo
{
void divide(int i,int j) throws ArithmeticException
    {
       int c=i/j;
System.out.println(c);	
                }
     public static void main(String[] args)
       {
ThrowsDemo t=new ThrowsDemo();
t.divide(2,0);
         }
  }
