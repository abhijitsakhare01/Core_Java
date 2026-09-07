
public class Operators {

    public static void main(String[] args) {

        // Data Types

        int number = 22;
        double salary = 25000.50;
        char  grand = 'A';
        byte c = 10;
        short s = 100;
        long l = 10000L;
        float f = 10.5f;
        
        System.out.println(number);
        System.out.println(salary);
        System.out.println(grand);
        System.out.println(c);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
       



        // Arithmatic Operators

        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        // Relation Operators

        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 != num2);
        System.out.println(num1 == num2);

        // Logical Operators

        System.out.println(num1 < num2 && num1 > num2);
        System.out.println(num1 < num2 || num1 > num2);
        System.out.println(!(num1 > num2));

        boolean a = true;
        boolean b = true;

        boolean isAdmin = false;
        System.out.println(!isAdmin);

        int num = 7;
        int result = num++;
        System.out.println(result);
        System.out.println(num);

        result = ++num;
        System.out.println(result);
        System.out.println(num);

        // Ternary Operator

        // condition ? trueValue : falseValue;

        int age = 20;

        String answer = (age >= 18) ? "Eligible" : "Not Eligible";

        System.out.println(answer);

    }

}