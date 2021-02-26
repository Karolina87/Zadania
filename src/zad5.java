import java.util.Scanner;
import java.lang.Math;
public class zad5 {
    public static void main(String[] args) {
        System.out.println("działania na liczbach całkowitych");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę A:");
        int a = userInput.nextInt();
        System.out.println("Podaj pierwszą liczbę B:");
        int b = userInput.nextInt();
        System.out.println("dodawanie (a+b): a =" +a + ", b=" + b + ", wynik to= " +(a+b));
        System.out.println("odejmowanie (a-b): a =" +a + ", b=" + b + ", wynik to= " +(a-b));
        System.out.println("mnożenie (a*b): a =" +a + ", b=" + b + ", wynik to= " +(a*b));
        System.out.println("dzielenie (a/b): a =" +a + ", b=" + b + ", wynik to= " +(a/b));
        System.out.println("podniesienie do potęgi (a^b): a =" +a + ", b=" + b + ", wynik to= " + (Math.pow(a,b)));

    }
}
