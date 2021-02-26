import java.util.Scanner;
public class zad7 {
    public static void main(String[] args) {
        System.out.println("Podaj swoje imię:");
        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();
        String john = "John Wick";
        if (name.equals(john)){
            System.out.println("Widzę, że znów pracujesz John");
        }else {
            System.out.println("Witaj " +name);
        }
    }
}
