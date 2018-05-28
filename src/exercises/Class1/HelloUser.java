package exercises.Class1;

        import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        String userName;
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        userName = in.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}