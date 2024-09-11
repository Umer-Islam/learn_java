import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        float num1 = sc.nextFloat();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);

        }
    }
}