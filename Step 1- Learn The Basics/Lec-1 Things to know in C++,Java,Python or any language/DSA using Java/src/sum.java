import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number : ");
        float number1 = sc.nextFloat();

        System.out.println("Input Second Number : ");
        float number2 = sc.nextFloat();

        float result = number1 + number2;

        System.out.println(result);
    }
}
