import java.util.ArrayList;

public class TotalCalculator{

public static int calculateTotalCalories(ArrayList<Integer> quantities) {
    int total = 0;
    for (int quantity : quantities) {
        total += quantity;
    }
    return total;
}

public static double calculateTotalSalt(ArrayList<Double> quantities) {
    double total = 0;
    for (double quantity : quantities) {
        total += quantity;
    }
    return total;
}
}
