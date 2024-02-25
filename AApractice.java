import java.util.Scanner;

public class AApractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count number of digits in the input number
        int numDigits = countDigits(number);

        // Create an array to store the digits
        int[] digitsArray = new int[numDigits];

        // Store each digit separately in the array
        int index = numDigits - 1; // Start from the end of the array
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            digitsArray[index] = digit;
            index--;
            number = number / 10; // Move to the next digit
        }

        // Print the array
        System.out.println("Digits stored in the array:");
        for (int i = 0; i < numDigits; i++) {
            System.out.print(digitsArray[i] + " ");
        }

        scanner.close();
    }

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
