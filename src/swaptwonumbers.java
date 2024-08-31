import java.util.Scanner;

public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int Number1 = sc.nextInt();
        System.out.println("Enter The Second Number");
        int Number2 = sc.nextInt();

        int temp = Number1;
        Number1 = Number2;
        Number2 = temp;

        System.out.println("First Number is "+Number1);
        System.out.println("Second Number is "+Number2);
    }
}
