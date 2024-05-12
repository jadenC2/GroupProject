import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodOrderSystem {
    private String customerName;
    private double total;
    private List<String> orderedItems;

    public FoodOrderSystem(String customerName) {
        this.customerName = customerName;
        this.total = 0.0;
        this.orderedItems = new ArrayList<>();
    }

    public void startOrdering(Scanner scanner) {
        boolean ordering = true;
        while (ordering) {
            System.out.println("What type of food would you like? \nPizza \nSushi \nBurger \nDessert \nBeverage");
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
                case "dessert":
                    orderDesserts(scanner);
                    break; // Added break statement
                case "beverage":
                    orderBeverage(scanner);
                    break; // Added break statement
                default:
                    System.out.println("Invalid choice. Please select from: \nPizza \nSushi \nBurger \nDessert \nBeverage.");
            }
            System.out.println("Would you like to purchase anything else? (yes/no)");
            String continueOrder = scanner.nextLine().toLowerCase();
            ordering = continueOrder.equals("yes");
        }
    }

    private void orderPizza(Scanner scanner) {
        System.out.println("What toppings would you like? \nSausage \nPepperoni \nVeggie");
        String pizzaType = scanner.nextLine().toLowerCase();
        total += 10.99;
        orderedItems.add("Pizza: " + pizzaType);
    }

    private void orderSushi(Scanner scanner) {
        System.out.println("What type of sushi would you like? \nCrab \nShrimp \nVeggie");
        String sushiType = scanner.nextLine().toLowerCase();
        total += 10.99;
        orderedItems.add("Sushi: " + sushiType);
    }

    private void orderBurger(Scanner scanner) {
        System.out.println("What type of burger would you like? \nCheeseburger \nVeggie Burger");
        String burgerType = scanner.nextLine().toLowerCase();
        total += 10.99;
        orderedItems.add("Burger: " + burgerType);
    }

    private void orderDesserts(Scanner scanner) {
        System.out.println("What dessert would you like? \nIce Cream \nBrownie \nCake");
        String dessertType = scanner.nextLine().toLowerCase();

        double dessertPrice = 0.0;
        switch (dessertType) {
            case "ice cream":
                dessertPrice = 3.99;
                break;
            case "brownie":
                dessertPrice = 4.99;
                break;
            case "cake":
                dessertPrice = 5.99;
                break;
            default:
                System.out.println("Invalid dessert choice. Please select from: \nIce Cream \nBrownie \nCake");
                return; // Return without adding to total if invalid choice
        }

        total += dessertPrice;
        orderedItems.add("Dessert: " + dessertType);
    }

    private void orderBeverage(Scanner scanner) {
        System.out.println("What beverage would you like? \nCoke \nSprite \nLemonade \nWater");
        String beverageType = scanner.nextLine().toLowerCase();

        double beveragePrice = 0.0;
        switch (beverageType) {
            case "coke":
            case "sprite":
            case "lemonade":
            case "water":
                beveragePrice = 1.99;
                break;
            default:
                System.out.println("Invalid beverage choice. Please select from: \nCoke \nSprite \nLemonade \nWater");
                return; // Return without adding to total if invalid choice
        }
        total += beveragePrice;
        orderedItems.add("Beverage: " + beverageType);
    }

    public double getTotal() {
        return total;
    }

    public List<String> getOrderedItems() {
        return orderedItems;
    }
}
