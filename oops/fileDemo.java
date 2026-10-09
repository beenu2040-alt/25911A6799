import java.io.File;
public class fileDemo {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        File f1=new File("DemoQ18.java");
        System.out.println("file name: "+ f1.getName());
        System.out.println("file path: "+f1.getPath());
        System.out.println("file absolute path: "+f1.getAbsolutePath());
        System.out.println("file parent class: "+f1.getParent());
        System.out.println(f1.exists());
        System.out.println(f1.canWrite());
        System.out.println(f1.canRead());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.isAbsolute());
        System.out.println(f1.lastModified());
        System.out.println(f1.length());
    }
}
