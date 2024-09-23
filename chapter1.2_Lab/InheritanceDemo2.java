class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String section_name;

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getSection_name() {
        return section_name;
    }
}

class Supervisor extends Employee {
    private int group_id;

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getGroup_id() {
        return group_id;
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Ram Bahadur Thapa");
        m.setSalary(50000);
        m.setSection_name("Accounts");
        System.out.println("Name: " + m.getName());
        System.out.println("Salary: " + m.getSalary());
        System.out.println("Section: " + m.getSection_name());

        Supervisor s = new Supervisor();
        s.setName("Sagar Kunwar");
        s.setSalary(40000);
        s.setGroup_id(5);
        System.out.println("Name: " + s.getName());
        System.out.println("Salary: " + s.getSalary());
        System.out.println("Group ID: " + s.getGroup_id());
    }
}
