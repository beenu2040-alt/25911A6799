import java.io.*;

public class FileCopy {
    public static void main(String args[]){
        String sourceFile="input.txt";
        String destinationFile="output.txt";
        try(BufferedReader reader= new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))){
                String line;
                while ((line=reader.readLine())!=null){
                    writer.write(line);
                    writer.newLine();
                }
                System.out.println("file copied successfully");
        } catch(IOException e){
            System.out.println("error: "+e.getMessage());
        }
    }
}
