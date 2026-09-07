public class Nested_IfElse_Example {
    
    public static void main(String[] args) {
        
        int age = 20;

        boolean hasLicese = false;

        if (age >= 18) {
            if(hasLicese == true) {
                System.out.println("you can Drive");
            } else {
                System.out.println("you Need License");
            }
        } else {
            System.out.println("You are Underage");
        }

    }

}
