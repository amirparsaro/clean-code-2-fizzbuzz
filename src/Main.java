import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to use a word for in a separate line: ");
        int numAmount = scn.nextInt();
        scn.nextLine();

        int[] numbers = new int[numAmount];
        String[] words = new String[numAmount];
        for (int i = 0; i < numAmount; i++) {
            System.out.print("Enter a number in a separate line: ");
            numbers[i] = scn.nextInt();
            scn.nextLine();

            System.out.print("Enter a word for that number in a separate line: ");
            words[i] = scn.nextLine();
        }

        System.out.print("Enter the first number in the range in a separate line: ");
        int startNum = scn.nextInt();
        scn.nextLine();

        System.out.print("Please enter the final number for the range in a separate line: ");
        int endNum = scn.nextInt();
        scn.nextLine();

        for (int i = startNum; i <= endNum; i++) {
            String output = "";

            for (int j = 0; j < numAmount; j++) {
                if (i % numbers[j] == 0) {
                    output += words[j];
                }
            }

            if (output.isEmpty()) {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }
    }
}