import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = sc.nextLine();
        System.out.println("Welcome "+name+" to KG Coding");
    }
}
