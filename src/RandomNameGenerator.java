import java.util.Random;

public class RandomNameGenerator {
    private static final String[] FIRST_NAMES = {"John", "Alice", "Michael", "Emma", "David", "Olivia", "James", "Sophia", "Robert", "Isabella"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson"};

    public static void main(String[] args) {
        Random random = new Random();
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];

        System.out.println("Random Name: " + firstName + " " + lastName);
    }
}

