import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Password creation
        System.out.println("Let's create a password.");
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        char lastLetterFirstName = Character.toUpperCase(firstName.charAt(firstName.length() - 1));
        Random random = new Random();
        int randomNumber = random.nextInt(90) + 10;
        String firstThreeLettersLastName = lastName.substring(0, Math.min(3, lastName.length())).toLowerCase();
        String password = lastLetterFirstName + String.valueOf(randomNumber) + firstThreeLettersLastName;
        System.out.println("Your password is: " + password);

        // Use concat method to add four **** values
        password = password.concat("****");

        // Print the password after using concat
        System.out.println("Password after using concat: " + password);

        // Reverse the password using StringBuilder
        StringBuilder reversedPassword = new StringBuilder(password);
        reversedPassword.reverse();

        // Print the reversed password
        System.out.println("Reversed password: " + reversedPassword);

        // Continue with food ordering
        System.out.println("\nWelcome to our food ordering system!");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your email:");
        String email = scanner.nextLine();
        System.out.println("Please enter your phone number (10 digits):");
        String phoneNumber = scanner.nextLine();
        while (!isValidPhoneNumber(phoneNumber)) {
            System.out.println("Invalid phone number. Please enter a 10-digit number:");
            phoneNumber = scanner.nextLine();
        }

        FoodOrderSystem foodOrderSystem = new FoodOrderSystem(name);
        foodOrderSystem.startOrdering(scanner);

        System.out.println("Thank you, " + name + "! Your total is: $" + foodOrderSystem.getTotal());
        System.out.println("We got your order! It'll be ready soon.");

        scanner.close();
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }
}
