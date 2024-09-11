import java.awt.font.OpenType;
import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("                  calculator                  \n\n\n");

        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        System.out.println("Select operator:\n1. + \n2. -\n3. x\n4. /");
        int operator = sc.nextInt();

        if (operator == 1) {
            System.out.println(num1 + num2);
        } else if (operator == 2) {
            System.out.println(num1 - num2);
        } else if (operator == 3) {
            System.out.println(num1 * num2);
        } else if (operator == 4) {
            System.out.println(num1 / num2);
        }
    }
}