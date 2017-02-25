package domain;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by prasanna on 25/02/17.
 */
public class Bill {

    public Bill(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    List<LineItem> lineItems;

    public void printReciept() {
        Float totalAmount = lineItems.stream()
                .map(LineItem::getTotal)
                .reduce(0f, (a, b) -> a + b);
        lineItems.forEach(System.out::println);
        System.out.println(String.format("Total - %s", totalAmount));
    }
}
