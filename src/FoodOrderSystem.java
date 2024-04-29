import java.util.Scanner;

//Add a spot for desserts option (ice cream, brownie, cake)

public class FoodOrderSystem {
    private String customerName;
    private double total;

    public FoodOrderSystem(String customerName) {
        this.customerName = customerName;
        this.total = 0.0;
    }

    public void startOrdering(Scanner scanner) {
        boolean ordering = true;
        while (ordering) {
            System.out.println("What type of food would you like? (pizza, sushi, burger)");
            String foodType = scanner.nextLine().toLowerCase();
            switch (foodType) {
                case "pizza":
                    orderPizza(scanner);
                    break;
                case "sushi":
                    orderSushi(scanner);
                    break;
                case "burger":
                    orderBurger(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please select from pizza, sushi, or burger.");
            }
            System.out.println("Would you like to purchase anything else? (yes/no)");
            String continueOrder = scanner.nextLine().toLowerCase();
            ordering = continueOrder.equals("yes");
        }
    }
    private void orderPizza(Scanner scanner) {
        System.out.println("What toppings would you like? (sausage, pepperoni, veggie)");
        String pizzaType = scanner.nextLine().toLowerCase();
        total += 10.99;
        System.out.println("You ordered a " + pizzaType + " pizza.");
    }

    private void orderSushi(Scanner scanner) {
        System.out.println("What type of sushi would you like? (crab, shrimp, veggie)");
        String sushiType = scanner.nextLine().toLowerCase();
        total += 10.99;
        System.out.println("You ordered " + sushiType + " sushi.");
    }

    private void orderBurger(Scanner scanner) {
        System.out.println("What type of burger would you like? (cheeseburger, veggie burger)");
        String burgerType = scanner.nextLine().toLowerCase();
        total += 10.99;
        System.out.println("You ordered a " + burgerType + ".");
    }

    public double getTotal() {
        return total;
    }
}
