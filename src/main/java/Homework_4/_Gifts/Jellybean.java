package Homework_4._Gifts;

public class Jellybean extends Sweets{
    private final String typeOfJellybeans;

    public Jellybean(String name, String typeOfJellybeans) {
        super(name);
        this.typeOfJellybeans = typeOfJellybeans;
    }

    public Jellybean(String name, double weight, double price, String typeOfJellybeans) {
        super(name, weight, price);
        this.typeOfJellybeans = typeOfJellybeans;
    }

    @Override
    public String descriptions() {
        return "Мармелад: [ " + super.toString() + ", Тип: " + typeOfJellybeans + " ]";
    }
}
