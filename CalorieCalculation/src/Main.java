import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Double> saltQuantities = new ArrayList<>();
        HashMap<String, FoodItem> foodItems = new HashMap<>();

        foodItems.put("Egg", new FoodItem("Egg", new Egg()));
        foodItems.put("Cheese", new FoodItem("Cheese", new Cheese()));
        foodItems.put("Milk", new FoodItem("Milk", new Milk()));
        // Add more food items as needed

        while (true) {
            System.out.println("What did you consume ('Calculate' to calculate total): ");
            String foodName = scan.nextLine();

            if (foodName.equals("Calculate")) {
                double totalCalories = TotalCalculator.calculateTotalCalories(quantities);
                double totalSalt = TotalCalculator.calculateTotalSalt(saltQuantities);
                System.out.println("Total consumed Calories: " + totalCalories + "cal");
                System.out.println("Total consumed Salt: " + totalSalt + " grams");
                break;
            }

            System.out.println("How many grams/liters did you consume: ");
            int quantity = scan.nextInt();
            scan.nextLine(); 

            FoodItem foodItem = foodItems.get(foodName);
            quantities.add(foodItem.calculateCalories(quantity));
            saltQuantities.add(foodItem.calculateSalt(quantity));
        }

        scan.close();
    }

  
}
