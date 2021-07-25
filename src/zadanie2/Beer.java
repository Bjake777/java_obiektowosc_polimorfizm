package zadanie2;

public class Beer extends Beverage {
    double alcoholContent;

    public Beer(double capacity, String ingredients, double alcoholContent) {
        super(capacity, ingredients);
        this.alcoholContent = alcoholContent;
    }

    @Override
    public void display() {
      super.display();
        System.out.println("alcoholContent" + alcoholContent);
    }
}
