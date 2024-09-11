import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("neither even nor odd");
        } else if (num % 2 == 0) {
            System.out.println(num + ": is even number");
        } else {
            System.out.println(num + ": is odd number");

        }

    }
}