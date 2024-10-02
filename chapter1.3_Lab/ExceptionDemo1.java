import java.io.*;
public class ExceptionDemo1 {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("abc.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s=br.readLine())!=null) {
                System.out.println(s);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("Error occoured "+e.getMessage());
        }
    }
}
