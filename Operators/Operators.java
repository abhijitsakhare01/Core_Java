
public class Operators {

    public static void main(String[] args) {

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

    }

}