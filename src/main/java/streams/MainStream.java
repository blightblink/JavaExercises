package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import streams.model.Coffee;
import streams.model.CoffeeBerry;
import streams.model.CoffeeMaking;
import streams.model.Size;

public class MainStream {

    public static void main(String args[]) {

        CoffeeMaking berry = new CoffeeBerry();
        List<Coffee> coffees = new ArrayList<>();

        for( int i =0 ; i <20; i++){
            coffees.add(berry.createRandomCoffee());
        }

        Map<Size,List<Coffee>> coffees2 = coffees.stream()
                .peek(x -> System.out.println(x.toString()))
                .sorted(Comparator.comparing(Coffee::getPrice))
           //     .filter(x -> x.getPrice()>2.0)
                .collect(Collectors.groupingBy(x-> x.getSize()));

        System.out.println("RESULTS HERE");

        /*for(Coffee c : coffees2) {
            System.out.println(c.toString());
        }*/
        coffees2.forEach( (k,v) -> {
            System.out.println(k.toString());
            v.forEach(System.out::println);
        });

    }
}
