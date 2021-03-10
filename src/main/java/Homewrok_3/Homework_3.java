package Homewrok_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Homework_3 {
    public static void main(String[] args) {
        int selectedProgram;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите программу:");
        System.out.print("1 - Калькулятор, 2 - Поиск максимального элемента в массиве: ");
        selectedProgram = scanner.nextInt();

        switch (selectedProgram) {
            case 1:
                Calculator(scanner);
                break;
            case 2:
                FindMaxlength(scanner);
                break;
            default:
                System.out.println("Неизвестная команда :(");
                break;
        }
    }
    /** Данный метод предназначен для поиска элемента в массиве, с максимальной длинной */
    private static void FindMaxlength(Scanner scanner) {
        int n;
        int maxLength = 0;
        String wordWithMaxLength = "";

        System.out.println("Введите размер массива: ");
        n = scanner.nextInt();

        String[] array = new String[n];

        // Заполнение массива
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d слово: ", i + 1);
            array[i] = scanner.next();
        }

        System.out.println("Массив:");

        // Вывод введённого пользователем масива в консоль
        for (String word : array) {
            System.out.print(word + " ");
        }

        // Поиск элемента массива с максимальной длинной
        for (int i = 0; i < n; i++) {
            if (array[i].length() > maxLength) {
                maxLength = array[i].length();
                wordWithMaxLength = array[i];
            }
        }

        System.out.println("\nСамое длинное слово: " + wordWithMaxLength + " с длинной " + maxLength);
    }

    /** Данный метод предназначен для вывода в консоль результата операции над числами */
    private static void Calculator(Scanner scanner) {
        String operation;
        double numberOne;
        double numberTwo;

        System.out.println("Введите операцию над числами: +, -, *, /");
        operation = scanner.next();

        System.out.println("Вычисления производятся в следующем виде:");
        System.out.println("A " + operation + " B");

        System.out.print("Введите A: ");
        numberOne = scanner.nextDouble();

        System.out.print("Введите B: ");
        numberTwo = scanner.nextDouble();

        // Вызов метода calc из класса Homewrok_3.SimpleCalculator
        SimpleCalculator.calc(numberOne, numberTwo, operation);
    }
}
