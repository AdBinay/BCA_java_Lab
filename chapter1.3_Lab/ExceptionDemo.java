public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("main method started");
        int a = 10,b=0;
        try{
            int c = a/b;
            System.out.println("the result is "+c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("main method ended");
    }
}