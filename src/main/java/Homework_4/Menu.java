package Homework_4;

import Homework_4.ArrayGeneration.ArrayGeneration;
import Homework_4._Gifts.*;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("Выберите программу:\n" +
                "1. Поиск чисел в массиве\n" +
                "2. Собрать новогодний подарок\n" +
                "3. Выход");

        switch (scanner.nextInt()) {
            case 1:
                ArrayGeneration arrayGeneration = new ArrayGeneration();
                break;
            case 2:
                Gift giftBox = new Gift();
                giftBox.addItem(new Candies("Рафаэлло", 100, 169.9, "Орех и кокосовая начинка"));
                giftBox.addItem(new Chocolate("Милка", 90, 69.99, "0%"));
                giftBox.addItem(new Jellybean("Haribo", 75, 135, "Червячки"));
                giftBox.addItem(new Cakes("Панчо", 1575, 650, "Круглый"));
                giftBox.printItems();
                System.out.println("Общий вес подарка: " + giftBox.getTotalWeight());
                System.out.println("Общая цена подарка: " + giftBox.getTotalPrice());
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Ошибка обработки или выбрана неверная программа. Повторите попытку.");
                break;
        }
    }
}
