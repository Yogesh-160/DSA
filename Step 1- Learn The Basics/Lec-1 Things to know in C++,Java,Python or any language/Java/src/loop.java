import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        int sum = 0;
Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n ; i++) {
            sum += i;

        }
        System.out.println(sum);
        }
    }

