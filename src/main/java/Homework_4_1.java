import java.util.Arrays;
import java.util.Random;

public class Homework_4_1 {
    public static void main(String[] args) {
        //1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
        // Найти максимальный отрицательный и минимальный положительный элементы массива.
        // Поменять их местами.

        Random random = new Random();
        int arraySize = 20;

        int[] primaryArray = new int[arraySize];

        int[] maxAndMinArray;

        int[] helpArray;

        for (int i = 0; i < primaryArray.length; i++) {
            primaryArray[i] = random.nextInt(20) - 10;
        }

        helpArray = Arrays.copyOf(primaryArray, arraySize);

        // Сортировка вспомогательного массива для упрощения поиска.
        Arrays.sort(helpArray);

        // Метод проверки вывода
        checkOutput(primaryArray, helpArray);

        // Метод поиска максимального отрицательного и минимального положительного чисел
        maxAndMinArray = findMaxAndMin(helpArray);

        // Метод проверки вывода
        checkOutput(maxAndMinArray);

        // Метод изменения положения чисел в массиве
        swapArrayMaxAndMinNumbers(primaryArray, maxAndMinArray);

        // Метод проверки вывода
        checkOutput(primaryArray);
    }

    private static void swapArrayMaxAndMinNumbers(int[] primaryArray, int[] maxAndMinArray) {
        int indexOfMaxNegative = 0;
        int indexOfMinPositive = 0;
        int maxNegative = maxAndMinArray[0];
        int minPositive = maxAndMinArray[1];

        for (int i = 0; i < primaryArray.length; i++){
            if (primaryArray[i] == maxNegative) {
                indexOfMaxNegative = i;
            }
            if (primaryArray[i] == minPositive) {
                indexOfMinPositive = i;
            }
        }

        for (int i = 0; i < primaryArray.length; i++){
            if (i == indexOfMaxNegative) {
                primaryArray[i] = minPositive;
            }
            if (i == indexOfMinPositive) {
                primaryArray[i] = maxNegative;
            }
        }

    }

    private static int[] findMaxAndMin(int[] array) {
        int maxNegative = 0;
        int minPositive = 0;

        for (int i = array.length - 1; i > -1; i--){
            if (array[i] < 0) {
                minPositive = array[i + 1];
                maxNegative = array[i];
                break;
            }
        }

        return new int[]{maxNegative, minPositive};
    }

    private static void checkOutput(int[] array) {
        for (int number : array) {
            System.out.printf("%d ", number);
        }

        System.out.println();
    }

    private static void checkOutput(int[] firstArray, int[] secondArray) {
        for (int number : firstArray) {
            System.out.printf("%d ", number);
        }

        System.out.println();

        for (int number : secondArray) {
            System.out.printf("%d ", number);
        }

        System.out.println();
    }
}
