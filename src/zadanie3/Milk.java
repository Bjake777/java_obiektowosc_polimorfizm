package zadanie3;

public class Milk extends Groceries {
    private double proteinContentPercentage;

    public Milk(String name, double price, int quantity, String expirationDate, double proteinContentPercentage) {
        super(name, price, quantity, expirationDate);
        this.proteinContentPercentage = proteinContentPercentage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("protein content: " + proteinContentPercentage + "%");
    }
}
