package zadanie2;

import java.util.Scanner;

public class BeverageFactoryApp {
    public static void main(String[] args) {
        BeverageWarehouse beverageWarehouse = new BeverageWarehouse();
        Scanner scanner = new Scanner(System.in);
        int decision = 0;
        int typeDecision = 0;

        double capacity;
        String ingredients;

        do {
            System.out.println("select options");
            System.out.println("add water - press 1");
            System.out.println("add beer - press 2");
            System.out.println("display all bevereges press 3");
            System.out.println("close the program - press 0");
            decision = scanner.nextInt();

            switch (decision) {
                case 1:
                    Type type;

                    System.out.println("enter capacity");
                    capacity = scanner.nextDouble();
                    System.out.println("enter ingredients");
                    scanner.nextLine();
                    ingredients = scanner.nextLine();

                    System.out.println("choose a type");
                    System.out.println("sparkling water - press 1");
                    System.out.println("still water - press 2");
                    typeDecision = scanner.nextInt();
                    if (typeDecision == 1) {
                        type = Type.SPARKLING_WATER;
                    } else {
                        type = Type.STILL_WATER;
                    }
                    Water water = new Water(capacity, ingredients, type);
                    beverageWarehouse.add(water);
                    break;

                case 2:
                    double alcoholContent;

                    System.out.println("enter capacity");
                    capacity = scanner.nextDouble();
                    System.out.println("enter ingredients");
                    scanner.nextLine();
                    ingredients = scanner.nextLine();
                    System.out.println("enter alcohol content");
                    alcoholContent = scanner.nextInt();

                    Beer beer = new Beer(capacity, ingredients, alcoholContent);
                    beverageWarehouse.add(beer);
                case 3:
                    beverageWarehouse.displayAll();
                    break;
            }
        } while (decision != 0);
    }
}
