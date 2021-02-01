package streams.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Coffee> coffees = new ArrayList<>();
    private String shop;

    public Order(String shop) {
        this.shop = shop;
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }


    public String getShop() {
        return shop;
    }

}
