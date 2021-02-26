import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        System.out.println("Podaj tempewraturę: ");
        Scanner userInput = new Scanner(System.in);
        double temp = userInput.nextDouble();
        CtoF(temp);
        FtoC(temp);
        CtoK(temp);
        KtoC(temp);
        KtoF(temp);
        FtoK(temp);
    }

    // Celsius to Fahrenheit
    private static void CtoF(double temp) {
        System.out.println("temp. z Celsjusza na Fahrenheit'a: " + 1.8 * temp + 32);
    }

    // Fahrenheit to Celsius
    private static void FtoC(double temp) {
        System.out.println("temp. z Fahrenheit'a na Celsjusza:  " + (temp - 32) / 1.8);
    }

    // Celsius to Kelvin
    private static void CtoK(double temp) {
        System.out.println("temp. z Celsjusza na Kelvin'a: " + temp + 273.15);
    }

    // Kelvin to Celsius
    private static void KtoC(double temp) {
        System.out.println("temp. z Kelvin'a naCelsjusza: " + (temp - 273.15));
    }

    // Kelvin to Fahrenheit
    private static void KtoF(double temp) {
        System.out.println("temp. z Kelvin'a na Fahrenheit'a: " + (temp - 273.15)*1.8 + 32);
    }

    // Fahrenheit to Kelvin
    private static void FtoK(double temp) {
        System.out.println("temp. z Fahrenheit'a na Kelvin'a: " + (temp - 32) / 1.8 + 273.15);
    }
}