package zadanie3;

public class Fruits extends Groceries {
    private String type;

    public Fruits(String name, double price, int quantity, String expirationDate, String type) {
        super(name, price, quantity, expirationDate);
        this.type = type;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("type: " + type);
    }
}
