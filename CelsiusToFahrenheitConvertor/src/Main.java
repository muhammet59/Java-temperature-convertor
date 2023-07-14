import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose what you want to convert\n************************************************\n1: Fahrenheit to Celsius 2: Celsius to Fahrenheit");
        int choice = s.nextInt();
        if(choice == 1)
        {
            System.out.println("Please enter the Fahrenheit value= ");
            double fahrenheit = s.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            double roundedCelsius = Math.round(celsius * 10) / 10.0;
            System.out.println(fahrenheit + " degree Fahrenheit is= " + roundedCelsius + " degree Celsius.");
        }
        else if(choice == 2)
        {
            System.out.println("Please enter the Celsius value= ");
            double celsius = s.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            double roundedFahrenheit = Math.round(fahrenheit * 10) / 10.0;
            System.out.println(celsius + " degree Celsius is= " + roundedFahrenheit + " degree Fahrenheit.");

        }
    }
}