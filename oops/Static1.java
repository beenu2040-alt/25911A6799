public class Static1{
    public void add(int a,int b){
        System.out.println((a+b));
    }
    public static void mul(){
        int a=5,b=10;
        System.out.println((a*b));
    }
    public static void main(String args[]){
        Static1 A= new Static1();
        A.add(7,9);
        Static1.mul();
    }
    
}