class overloading{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        overloading O=new overloading();
        System.out.println(O.add(9,4));
        System.out.println(O.add(1,2,3));
    }
}