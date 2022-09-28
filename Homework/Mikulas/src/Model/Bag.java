package Model;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Interfaces.Bag {
    private List<Present> content = new ArrayList<>();
    @Override
    public void addPresent(Present present) { content.add(present); }

    /** Gets the price of a specific Present (index required) */
    @Override
    public Present getPresent(int i) { return content.get(i); }

    /** Shows the entire content of the Bag. */
    @Override
    public void showContent() {
        for (Present item : content) {
            System.out.println(item);
        }
    }

    /** Sums up the prices of the Bag's Presents */
    @Override
    public int sumPrice() {
        int sum = 0;
        for (Present item : content) {
            sum += item.getPrice();
        }
        return sum;
    }
}
