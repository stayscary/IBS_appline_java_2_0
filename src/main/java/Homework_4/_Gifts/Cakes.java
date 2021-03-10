package Homework_4._Gifts;

public class Cakes extends Sweets{

    private final String form;

    public Cakes(String name, String form) {
        super(name);
        this.form = form;
    }

    public Cakes(String name, double weight, double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    @Override
    public String descriptions() {
        return "Пирог: [ " + super.toString() + ", Форма: " + form + " ]";
    }
}
