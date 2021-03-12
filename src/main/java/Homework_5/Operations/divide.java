package Homework_5.Operations;

public class divide implements Operation {
    @Override
    public double calculateResult(double firstNum, double secondNum) {
        try {
            return firstNum / secondNum;
        } catch (Exception e) {
            System.out.println("Error during DIV/0! Error code: ");
            return e.hashCode();
        }
    }
}
