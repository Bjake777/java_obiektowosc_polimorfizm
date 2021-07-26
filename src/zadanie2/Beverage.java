package zadanie2;

public class Beverage {
    private double capacity;
    private String ingredients;

    public Beverage(double capacity, String ingredients) {
        this.capacity = capacity;
        this.ingredients = ingredients;
    }

    public void display() {
        System.out.println("capacity: " + capacity);
        System.out.println("ingredients: " + ingredients);
    }
}
