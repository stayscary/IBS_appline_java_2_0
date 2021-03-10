package Homework_4._Gifts;

public abstract class Sweets {
    private String name;
    private double weight;
    private double price;

    public Sweets(String name) {
        this.name = name;
    }

    public Sweets(String name,double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price > 0) {
            this.price = price;
        } else {
            throw new Exception("Цена не может быть < 0");
        }
    }

    @Override
    public String toString() {
        return ("Название: " + name + ", Вес: " + weight + " гр., Цена: " + price + "руб.");
    }

    public abstract String descriptions();
}
