class ExceptionDemo
{
public static void main(String[] args)
{
try{
int a=10,b;
b=a/0;
System.out.println("value"+b);
}

catch(ArithmeticException e)
{
System.out.println("Exception raised division by zero");
}

System.out.println("quit");
}
}
