package streams.model;

public class CoffeeBerry implements CoffeeMaking {

    public CoffeeBerry() {
    }

    @Override
    public Coffee createCoffee(CoffeeType type, Size size, String sugar, boolean brownSuger) {
        Coffee coffee = new Coffee();
        coffee.setName(type);
        coffee.setSize(size);
        coffee.setSugarLevel(sugar);
        coffee.setBrownSugar(brownSuger);
        coffee.setPrice(calculatePrice(type, size));

        return coffee;
    }

    protected double calculatePrice(CoffeeType type, Size size){
        double multiplier = calculatePriceMultiplier(size);
        switch (type){
            case FREDDO_ESPRESSO:
                return 1.7 * multiplier;
            case FREDDO_CAPPUCINO:
                return 1.8 * multiplier;
            case ESPRESSO:
                return 1.2 * multiplier;
            case CAPPUCINO:
                return 1.4 * multiplier;
            case FRAPPE:
                return 1.0 * multiplier;
            case GREEK_COFFEE:
                return 0.8 * multiplier;
            default:
                return 2.0;
        }
    }

    private double calculatePriceMultiplier(Size size) {
        switch (size){
            case M:
                return 1.0;
            case S:
                return 0.7;
            case L:
                return 1.3;
            case XL:
                return 1.8;
            case JUMBO:
                return 3.0;
            default:
                return 1.0;
        }
    }


}
