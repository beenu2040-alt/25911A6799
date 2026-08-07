class SuperDemo{
    void display(){
        System.out.println("super class method");
     }
}


class SubDemo extends SuperDemo{
       void call(){
                System.out.println("subb class method");
    }
}
 class SingleInheritance{
    public static void main(String[] args){
       SubDemo s=new SubDemo();
        s.display();
        s.call();
    }
}
