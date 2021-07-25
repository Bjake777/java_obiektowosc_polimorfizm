package zadanie2;

import java.util.ArrayList;
import java.util.List;

public class BeverageWarehouse {
    List<Beverage> beverages;

    public BeverageWarehouse() {
        beverages = new ArrayList<>();
    }

    public void add(Beverage beverage) {
        beverages.add(beverage);
    }

    public void displayAll() {
        for (Beverage beverage:beverages) {
            beverage.display();
        }
    }
}
