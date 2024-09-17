class Demo3 {
    public static void main(String[] args) {
        // Declare and initialize a string variable
        String name = "Ram Thapa";
        
        // Concatenation of a string with a variable
        String str1 = String.format("My Name is %s", name);

        // Output a floating-point number up to 8 decimal places
        String str2 = String.format("My answer is %.8f", 27.65734);

        // Output with 15 spaces between the text and the number, formatted to 8 decimal places
        String str3 = String.format("My answer is %15.8f", 27.65734);

        // Output the floating-point number up to 2 decimal places
        String str4 = String.format("My answer is %.2f", 27.65734);

        // Format a string with a name and a roll number
        int roll = 15;
        String str5 = String.format("My name is %s and my roll number is %d", name, roll);

        // Print all the formatted strings
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
