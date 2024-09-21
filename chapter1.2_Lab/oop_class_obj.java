class pen{
    String color;
    String type; //ball , gel, fountain
    int price;
    public void write(){
        System.out.println("pen is writing");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }
    public void printprice(){
        System.out.println(this.price);
    }
}
public class oop_class_obj {
    public static void main(String[] args) {
        pen pn = new pen();
        pen p1 = new pen();
        pn.color = "blue";
        pn.type = "fountain";
        pn.price = 50;
        pn.printcolor();
        pn.printtype();
        pn.printprice();
        pn.write();
        p1.price=33;
        p1.printprice();
    }
}
