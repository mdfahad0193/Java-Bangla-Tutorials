import java.util.Scanner;

public class TemperatureConverterftoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels, farn;

        System.out.println("Fahrenheit: ");
        farn = input.nextDouble();

        cels= 0.56*(farn-32);
        System.out.println(cels);
    }
}
