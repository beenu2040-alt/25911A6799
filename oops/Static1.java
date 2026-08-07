public class Static1{
    public void add(int a,int b){
        System.out.println((a+b));
    }
    public static void mul(int a,int b){
        
        System.out.println((a*b));
    }
    public static void main(String args[]){
        Static1 A= new Static1();
        A.add(7,9);
        mul(1,2);
    }
}