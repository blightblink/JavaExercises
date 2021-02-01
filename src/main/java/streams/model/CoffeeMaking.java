package streams.model;

import util.RandomUtil;

public interface CoffeeMaking {

    Coffee createCoffee(CoffeeType type, Size size, String sugar, boolean brownSuger);

    default Coffee createRandomCoffee() {
        return RandomUtil.randomCoffee();
    }



}
