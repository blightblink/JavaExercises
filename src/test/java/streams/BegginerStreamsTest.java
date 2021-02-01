package streams;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import streams.model.Coffee;
import streams.model.CoffeeBerry;
import streams.model.CoffeeType;
import streams.model.Order;
import streams.model.Size;

public class BegginerStreamsTest {

    List<Order> orders = new ArrayList<>();


    @BeforeEach
    private void init(){
        CoffeeBerry cb1 = new CoffeeBerry();

        Order o1 = new Order(cb1.getClass().getSimpleName());
        cb1.createCoffee(CoffeeType.FREDDO_ESPRESSO, Size.M, "Metrios", true);
        cb1.createCoffee(CoffeeType.FRAPPE, Size.M, "Metrios", true);
        cb1.createCoffee(CoffeeType.FREDDO_CAPPUCINO, Size.M, "Glikos", false);
        cb1.createCoffee(CoffeeType.FREDDO_ESPRESSO, Size.M, "Sketos", false);
    }

    @Test
    public void tt(){

        orders.stream().forEach( x-> x.getShop());

    }

}
