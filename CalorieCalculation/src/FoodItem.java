public class FoodItem {
    private String name;
    private IFood calculator;

    public FoodItem(String name, IFood calculator) {
        this.name = name;
        this.calculator = calculator;
    }

    public int calculateCalories(int quantity) {
        return (int) calculator.calculateCalories(quantity);
    }

    public double calculateSalt(int quantity) {
        return calculator.calculateSalt(quantity);
    }
}