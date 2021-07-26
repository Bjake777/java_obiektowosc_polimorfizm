package zadanie3;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("quantity: " + quantity);
    }

}
