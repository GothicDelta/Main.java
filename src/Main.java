import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        int previousNumber;
        int currentNumber;

        System.out.println("Enter integers one at a time.");
        System.out.println("Each number must be greater than the previous one.");
        System.out.println("Enter 0 to stop.\n");

        System.out.print("Enter first number: ");
        previousNumber = input.nextInt();

        if (previousNumber == 0) {
            System.out.println("Numbers entered: 0");
            return;
        }

        count = 1;

        while (true) {
            System.out.print("Enter next number: ");
            currentNumber = input.nextInt();

            if (currentNumber == 0) {
                break;
            }

            if (currentNumber <= previousNumber) {
                break;
            }

            count++;
            previousNumber = currentNumber;
        }

        System.out.println("\nNumbers entered: " + count);
        input.close();
    }
}
//fsjisjfijsdifsdjsdsdfdskfs
// fpkfpsodflkmlm
// dsisdkfvisjefgiofejsfopesw
//THIS IS A CHANGE PLS PUSH