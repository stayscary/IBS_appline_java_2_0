import java.util.Scanner;

/** SimpleCalculator
 * Эта программа предназначена для вычисления арифметических операций чисел,
 * введённых пользователем.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        calc(numberOne, numberTwo, operation);
    }

    /** Данный метод предназначен для вывода в консоль результата операции над числами */
    static void calc(double numberOne, double numberTwo, String operation) {
        switch (operation) {
            case "+":
                System.out.printf("%.4f + %.4f = %.4f", numberOne, numberTwo, numberOne + numberTwo);
                break;
            case "-":
                System.out.printf("%.4f - %.4f = %.4f", numberOne, numberTwo, numberOne - numberTwo);
                break;
            case "*":
                System.out.printf("%.4f * %.4f = %.4f", numberOne, numberTwo, numberOne * numberTwo);
                break;
            case "/":
                if (numberTwo != 0) {
                    System.out.printf("%.4f / %.4f = %.4f", numberOne, numberTwo, numberOne / numberTwo);
                } else {
                    System.out.println("Не могу вычислить :(");
                }
                break;
            default:
                System.out.println("Неизвестная операция!");
                break;
        }
    }


}