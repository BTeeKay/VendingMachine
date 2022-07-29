import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        Setup.setupInstances();

        while (run) {
            System.out.println("Hello and Welcome to the Vendy");
            System.out.println("Press 1 to add 1 pound");
            System.out.println("Press 2 to add 50p");
            System.out.println("Press 3 to add 20p");
            System.out.println("Press 5 to add 10p");
            System.out.println("Press 6 to add 5p");
            System.out.println("Press 7 to see options");
            System.out.println("Press 8 to close");
            int answer = scanner.nextInt();
            if (answer == 1) {
                Setup.vendy.customerAddCoin(Setup.pound);
            }
            if (answer == 8) {
                System.out.println("Thank you for using Vendy");
                break;
            }
        }
    }
}
