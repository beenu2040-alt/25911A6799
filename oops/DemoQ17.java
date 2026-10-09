import java.util.*;
public class DemoQ17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integers: ");
        String line=sc.nextLine();
        StringTokenizer st= new StringTokenizer(line);
        int sum=0;
        System.out.println("integers entered are: ");
        while(st.hasMoreTokens()){
            int num= Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum=sum+num;
        }
        System.out.println("sum of integers"+sum);
    }
}
