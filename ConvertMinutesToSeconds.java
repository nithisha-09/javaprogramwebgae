import java.util.Scanner;

public class ConvertMinutesToSeconds {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of minutes.
        System.out.println("Enter the number of minutes: ");

        // Read the number of minutes from the console.
        int minutes = scanner.nextInt();

        // Convert the number of minutes to seconds.
        int seconds = minutes * 60;

        // Print the number of seconds to the console.
        System.out.println(seconds + " seconds");
    }
}