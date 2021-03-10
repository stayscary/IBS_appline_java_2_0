package Homework_4._Gifts;

public class Chocolate extends Sweets {

    private final String cacao;

    public Chocolate(String name, String cacao) {
        super(name);
        this.cacao = cacao;
    }

    public Chocolate(String name, double weight, double price, String cacao) {
        super(name, weight, price);
        this.cacao = cacao;
    }

    @Override
    public String descriptions() {
        return "Шоколад: [ " + super.toString() + ", Содержание какао: " + cacao + " ]";
    }
}
