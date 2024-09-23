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

        switch (operator) {
            case operator!=1:
            System.out.println("not equal to 1");
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                break;
        }
    }
}