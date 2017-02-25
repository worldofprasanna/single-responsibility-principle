package domain;

/**
 * Created by prasanna on 25/02/17.
 */
public class LineItem {
    Product product;
    Integer quantity;

    public LineItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s - quantity %s = total %s", product.toString(), quantity, this.getTotal());
    }

    public float getTotal() {
        return quantity * product.getPrice();
    }
}
