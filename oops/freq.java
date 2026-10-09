import java.util.*;
public class freq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text: ");
        String text= sc.nextLine().toLowerCase();
        String[] words =text.split("\\s+");
        HashMap<String,Integer> freq =new HashMap<>();
        for (String word : words){
            if (freq.containsKey(word)){
                freq.put(word,freq.get(word)+1);
            }
            else{
                freq.put(word,1);
            }

        }
        System.out.println("word frequency");
        for (Map.Entry<String,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
    }
}
