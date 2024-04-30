import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Main {
    //Added formatter for two decimal places ($X.XX)
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final String[] FIRST_NAMES = {"John", "Alice", "Michael", "Emma", "David", "Olivia", "James", "Sophia", "Robert", "Isabella"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Password creation
        System.out.println("Let's create a password.");
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
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
        System.out.println("\nWelcome to our Click N Eat food ordering system!");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your email (Must contain an '@' symbol):");
        String email = scanner.nextLine();
        while (!isValidEmail(email)) {
            System.out.println("Invalid email. Please enter an email with the '@' symbol");
            email = scanner.nextLine();
        }
        System.out.println("Please enter your phone number (10 digits):");
        String phoneNumber = scanner.nextLine();
        while (!isValidPhoneNumber(phoneNumber)) {
            System.out.println("Invalid phone number. Please enter a 10-digit number:");
            phoneNumber = scanner.nextLine();
        }

        FoodOrderSystem foodOrderSystem = new FoodOrderSystem(name);
        foodOrderSystem.startOrdering(scanner);

        // Calculate total with tax
        double subtotal = foodOrderSystem.getTotal();
        double tax = 0.06 * subtotal;
        double total = subtotal * 1.06;


        // Ask for tip
        System.out.println("Would you like to add a tip? (yes/no)");
        String tipChoice = scanner.nextLine();
        double tip = 0.00;
        if (tipChoice.equals("yes") || tipChoice.equals("y")) {
            System.out.println("Enter the tip amount:");
            tip = scanner.nextDouble();
        }

        total += tip;


        System.out.println("Thank you, " + name + "! Your subtotal is: $" + df.format(subtotal));
        System.out.println("Tax (6%): $" + df.format(tax));
        System.out.println("Tip: $" +df.format(tip));
        System.out.println("Total amount: $" + df.format(total));
        String NameFirst = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String NameLast = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        System.out.println("Your deliverers name is: " + NameFirst + " " + NameLast);

        scanner.close();
    }


    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }
    private static boolean isValidEmail(String email) {
        return email.contains("@");
    }
}





