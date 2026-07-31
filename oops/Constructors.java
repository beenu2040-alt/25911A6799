class Constructors{
    int a,b;
    Constructors() {
        System.out.println("15");
    }

    Constructors(int a,int b) {
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
    public static void main(String args[]){
        Constructors C1= new Constructors();
        Constructors C2= new Constructors(1,2);
    }
}