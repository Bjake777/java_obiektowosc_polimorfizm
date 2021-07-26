package zadanie3;

import java.util.ArrayList;
import java.util.List;

public class OnlineShopWarehouse {
    private List<Product> products;

    public OnlineShopWarehouse() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayAll() {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).display();
        }
    }

}
