package zadanie2;

public class Water extends Beverage {
    private Type type;

    public Water(double capacity, String ingredients, Type type) {
        super(capacity, ingredients);
        this.type = type;
    }

    @Override
    public void display() {
        super.display();
        String typeToString = type.toString();

        if (typeToString.equals("SPARKLING_WATER")) {
            System.out.println("type: sparkling water");
        } else {
            System.out.println("type: still water");
        }
    }

}
