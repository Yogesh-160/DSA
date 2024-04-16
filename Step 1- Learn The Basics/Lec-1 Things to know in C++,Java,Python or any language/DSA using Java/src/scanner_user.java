import java.util.Scanner;
public class scanner_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num 2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter Operator : {+,-,*,/}");
        char op = sc.next().charAt(0);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid! Try again");
        }
    }
}
