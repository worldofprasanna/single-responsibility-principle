package domain;

/**
 * Created by prasanna on 25/02/17.
 */
public class Product {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    private Float price;


    public Product(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Name - %s", this.getName());
    }
}
