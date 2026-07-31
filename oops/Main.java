class Main{
    void add(int x,int y){
        System.out.println("Addition:");
        System.out.println(x+"+"+y+"="+(x+y));
    }
    void sub(int x,int y){
        System.out.println("Subtraction:");
        System.out.println(x+"-"+y+"="+(x-y));
    }
    void mul(int x,int y){
        System.out.println("Multiplication:");
        System.out.println(x+"*"+y+"="+(x*y));
    }
    void div(float x,float y){
        System.out.println("Division:");
        System.out.println(x+"/"+y+"="+(x/y));
    }
    public static void main(String[] args){
        Main A= new Main();
        A.add(8,9);
        A.sub(10,8);
        A.mul(3,8);
        A.div(10,7);
    }
}