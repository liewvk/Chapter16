import java.util.Scanner;

public class SafeNumberInputSystem {

    public static int readPositiveInteger(Scanner input, String prompt) {
        int number = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print(prompt);
                String text = input.nextLine();

                number = Integer.parseInt(text);

                if (number <= 0) {
                    System.out.println("Please enter a number greater than 0.");
                } else {
                    valid = true;
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }

        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = readPositiveInteger(input, "Enter your age: ");
        int quantity = readPositiveInteger(input, "Enter quantity: ");

        System.out.println();
        System.out.println("Valid Input Report");
        System.out.println("------------------");
        System.out.println("Age     : " + age);
        System.out.println("Quantity: " + quantity);

        input.close();
    }
}
