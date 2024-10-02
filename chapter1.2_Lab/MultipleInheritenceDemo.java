interface A{
    int a = 5;
    void displayValueOfA();
}
interface B{
    int b = 15;
    void displayValueOfB();
}
interface C extends A,B{
    int c = 25;
    void displayValueOfC();
}
class MyClass implements C{
    public void displayValueOfA(){
        System.out.println("The value of a is "+a);
    }
    public void displayValueOfB(){
        System.out.println("The value of b is "+b);
    }
    public void displayValueOfC(){
        System.out.println("The value of c is "+c);
    }
}
public class MultipleInheritenceDemo {
    public static void main(String[] args) {
        MyClass m  = new MyClass();
        m.displayValueOfA();
        m.displayValueOfB();
        m.displayValueOfC();
    }
}
