// A class Room consists of two fields length and breadth and method int area() to 
// find the area of the room. 
// A new class BedRoom is derived from class Room and consists of an additional field height and two methods: 
// setData(int, int, int) to set the values for the three fields, and int volume() to find the volume. 
// Now write the Java program to input 
// the length, breadth, and height and find the area and volume. What form of inheritance will the classes hold in this case?


import java.util.Scanner;

class Room {
    protected int length;
    protected int breadth;

    public int getArea() {
        return length * breadth;
    }
}

class BedRoom extends Room {
    private int height;

    public void setData(int x, int y, int z) {
        length = x;
        breadth = y;
        height = z;
    }

    public int getVolume() {
        return length * breadth * height;
    }
}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        BedRoom br = new BedRoom();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int l = sc.nextInt();
        
        System.out.println("Enter the breadth:");
        int b = sc.nextInt();
        
        System.out.println("Enter the height:");
        int h = sc.nextInt();

        br.setData(l, b, h);

        System.out.println("The area of Bedroom is: " + br.getArea());
        System.out.println("The volume of Bedroom is: " + br.getVolume());

        sc.close();
    }
}
