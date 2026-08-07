class CallDemo1{
    void display(int x){
        x=x+100;
    }
    public static void main(String args[]){
        CallDemo1 d=new CallDemo1();
        int a=100;
        System.out.println("before calling "+a);
        d.display(a);
        System.out.println("after calling "+a);
    }
}

