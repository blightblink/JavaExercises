package streams.model;

import java.util.Objects;

public class Coffee {
    private CoffeeType name;
    private Size size;
    private double price;
    private String sugarLevel;
    private boolean brownSugar;

    public Coffee() {
    }


    public Coffee(CoffeeType name, Size size, Double price, String sugarLevel, boolean brownSugar) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.sugarLevel = sugarLevel;
        this.brownSugar = brownSugar;
    }

    public CoffeeType getName() {
        return name;
    }

    public void setName(CoffeeType name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(String sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public boolean isBrownSugar() {
        return brownSugar;
    }

    public void setBrownSugar(boolean brownSugar) {
        this.brownSugar = brownSugar;
    }


    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", sugarLevel='" + sugarLevel + '\'' +
                ", brownSugar=" + brownSugar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.price, price) == 0 &&
                brownSugar == coffee.brownSugar &&
                name == coffee.name &&
                size == coffee.size &&
                Objects.equals(sugarLevel, coffee.sugarLevel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, size, price, sugarLevel, brownSugar);
    }
}
