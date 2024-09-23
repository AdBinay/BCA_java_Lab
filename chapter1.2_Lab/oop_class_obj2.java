class Student{
    String name;
    String address;
    String faculty;
    
    Student(String name, String address, String faculty){
        this.name = name;
        this.address = address;
        this.faculty = faculty;
    }
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.faculty);
    }

}

public class oop_class_obj2 {
    public static void main(String[] args) {
        Student s1 = new Student("binay", "pokhara", "BCA");
        s1.printinfo();
    }
}
