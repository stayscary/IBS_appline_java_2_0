package Homework_5;

import Homework_5.Operations.*;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        String operation = "";

        System.out.println("Введите 2 числа и операцию над числами (+, -, *, /):");
        try {
            System.out.print("Число 1: ");
            firstNumber = scanner.nextDouble();
            System.out.print("Число 2: ");
            secondNumber = scanner.nextDouble();
            System.out.print("Операция: ");
            operation = scanner.next();
        } catch (Exception e) {
            System.out.println("Вы ввели некорректные данные\n" + Arrays.toString(e.getStackTrace()));
        }
        control(firstNumber, secondNumber, operation);
    }

    public static void control(double firstNumber, double secondNumber, String operation) {
        Operation logicOperation;
        double result;
        System.out.println("Ответ:");
        switch (operation) {
            case "+":
                logicOperation = new sum();
                result = logicOperation.calculateResult(firstNumber, secondNumber);
                break;
            case "-":
                logicOperation = new difference();
                result = logicOperation.calculateResult(firstNumber, secondNumber);
                break;
            case  "/":
                logicOperation = new divide();
                result = logicOperation.calculateResult(firstNumber, secondNumber);
                break;
            case "*":
                logicOperation = new multiplication();
                result = logicOperation.calculateResult(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Неизвестная операция");
                result = -1;
                break;
        }
        System.out.print(result);
    }
}

