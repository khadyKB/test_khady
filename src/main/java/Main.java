import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter X: ");
            int X = sc.nextInt();
            System.out.print("Enter Y: ");
            int Y = sc.nextInt();
            System.out.print("Enter orientation (N, E, W, S): ");
            String Orientation = sc.next();
            System.out.println("Enter instructions : ");
            String Instructions = sc.next();
            vacuum_control Vacuum = new vacuum_control();
            System.out.println(Vacuum.move(X, Y, Orientation, Instructions));
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
