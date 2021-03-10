package Homework_4._Gifts;

import java.util.LinkedList;
import java.util.List;

public class Gift {

    List<Sweets> sweetsList = new LinkedList<>();
    private double totalWeight = 0;
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void addItem(Sweets sweet) {
        sweetsList.add(sweet);
        totalPrice += sweet.getPrice();
        totalWeight += sweet.getWeight();
    }

    public void printItems() {
        for (Sweets s : sweetsList) {
            System.out.println(s.descriptions());
        }
    }
}
