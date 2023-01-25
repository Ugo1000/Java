import java.util.Scanner;

public class SciCalc {

    public static Scanner scanner;

    public double sqr() {
        double x;
        System.out.println("SQUARE ROOT");
        scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        x = scanner.nextDouble();
        return (int) Math.sqrt(x);
    }cd
}
