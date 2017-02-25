import domain.Bill;
import domain.LineItem;
import domain.Product;

import java.util.Arrays;

/**
 * Created by prasanna on 25/02/17.
 */
public class Application {
    public static void main(String[] args) {
        Product iphone = new Product("IPhone", 120.00f);
        Product samsung = new Product("Samsung s7", 80.00f);

        LineItem item1 = new LineItem(iphone, 5);
        LineItem item2 = new LineItem(samsung, 2);

        Bill bill = new Bill(Arrays.asList(item1, item2));

        bill.printReciept();
    }
}
