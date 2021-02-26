import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        System.out.println("Poproszę hasło");
        Scanner userInput = new Scanner(System.in);
        String password = userInput.next();
        if (password.equals("secret")) {
            System.out.println("Witaj w tajnym miejscu");
        }else;

    }
}
