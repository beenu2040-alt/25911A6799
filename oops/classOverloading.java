class classOverloading{
    String name;
    int rollno;
    int marks;
    classOverloading(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
        System.out.println(name+" "+rollno);
    }
    classOverloading(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
         System.out.println(name+" "+rollno+" "+marks);
    }
    public static void main(String args[]){
        classOverloading C1=new classOverloading("osman",99);
        classOverloading C2=new classOverloading("osman",99,22);
    }
}