package Homework_4._Gifts;

public class Candies extends Sweets {

    private final String filling;

    public Candies(String name, String filling) {
        super(name);
        this.filling = filling;
    }

    public Candies(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    @Override
    public String descriptions() {
        return "Конфеты: [ " + super.toString() + ", Начинка: " + filling + " ]";
    }
}
