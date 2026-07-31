import java.util.Scanner;

class Student{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter student details");

        System.out.println("Name:");
        String name=scanner.nextLine();

        System.out.println("Roll number:");
        String rollno=scanner.nextLine();

        System.out.println("Branch:");
        String branch=scanner.nextLine();

        System.out.println("Section:");
        String sec=scanner.nextLine();

        System.out.println("Details");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+rollno);
        System.out.println("Branch:"+branch);
        System.out.println("Section:"+sec);
    }
}