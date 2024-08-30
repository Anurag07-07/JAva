import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1 = sc.nextInt();
        System.out.println("Enter The Second Number");
        int number2 = sc.nextInt();
        int sum = number1+number2;
        System.out.println("Ths sum of Two number is "+sum);
    }
}
