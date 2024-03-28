import java.util.Scanner;

public class ClickNEat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user information
        System.out.println("Welcome to Click N Eat!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Please enter your email address: ");
        String email = scanner.nextLine();

        // Displaying available food places
        System.out.println("\nAvailable Food Places:");
        System.out.println("1. Pizza Palace");
        System.out.println("2. Burger Bistro");
        System.out.println("3. Sushi Haven");

        // Asking for food choice
        System.out.print("\nPlease enter the number of the food place you want to order from: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String foodPlace;
        switch (choice) {
            case 1:
                foodPlace = "Pizza Palace";
                break;
            case 2:
                foodPlace = "Burger Bistro";
                break;
            case 3:
                foodPlace = "Sushi Haven";
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        // Asking for food type
        System.out.print("\nWhat type of food would you like to order from " + foodPlace + "?: ");
        String foodType = scanner.nextLine();

        // Displaying order details
        System.out.println("\nOrder Summary:");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Food Place: " + foodPlace);
        System.out.println("Food Type: " + foodType);

        // Calculating total (assuming a fixed price for each item)
        double totalPrice = 10.99; // Assuming a fixed price
        System.out.println("Total: $" + totalPrice);

        // Asking for confirmation
        System.out.print("\nType 'confirm' to place your order: ");
        String confirmation = scanner.nextLine();

        // Finalizing order
        if (confirmation.equalsIgnoreCase("confirm")) {
            System.out.println("Thank you! Your order will be ready soon.");
        } else {
            System.out.println("Order cancelled. Thank you for visiting Click N Eat!");
        }

        scanner.close();
    }
}
