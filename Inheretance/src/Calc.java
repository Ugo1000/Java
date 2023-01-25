import java.util.Scanner;

public class Calc  extends SciCalc{

    public int add() {
        int x, y;
        scanner = new Scanner(System.in);
        System.out.println("Enter x : ");
        x = scanner.nextInt();
        System.out.println("Enter y : ");
        y = scanner.nextInt();
        return x + y;
    }

    public int mul() {
        int x, y;
        System.out.println("MULTIPLICATION😀");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x : ");
        x = scanner.nextInt();
        System.out.println("Enter y : ");
        y = scanner.nextInt();
        System.out.print("Answer = ");
        return x * y;
    }
}
