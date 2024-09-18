class Student {
    private int roll;

    // Setter method to set the roll number
    public void setRoll(int roll) {
        this.roll = roll;
    }

    // Getter method to retrieve the roll number
    public int getRoll() {
        return roll;
    }
}

class Student1 {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student s = new Student();

        // Setting the roll number
        s.setRoll(5);

        // Retrieving and displaying the roll number
        int r = s.getRoll();
        System.out.println("Roll = " + r);
    }
}
