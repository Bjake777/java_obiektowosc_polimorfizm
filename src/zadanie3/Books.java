package zadanie3;

public class Books extends Product {
    private Author author;

    public Books(String name, double price, int quantity, Author author) {
        super(name, price, quantity);
        this.author = author;
    }

    @Override
    public void display() {
        super.display();
        author.display();
    }
}
