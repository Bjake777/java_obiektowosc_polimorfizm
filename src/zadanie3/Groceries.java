package zadanie3;

public class Groceries extends Product {
    private String expirationDate;

    public Groceries(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("expiration date: " + expirationDate);
    }
}
