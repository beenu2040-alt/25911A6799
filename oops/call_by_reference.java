class ReferenceDemo1{
    int x=100;
    void display(ReferenceDemo1 R){
        R.x=R.x+100;
    }
    public static void main(String args[]){
        ReferenceDemo1 d=new ReferenceDemo1();
        System.out.println("before calling "+d.x);
        d.display(d);
        System.out.println("after calling "+d.x);
    }
}
