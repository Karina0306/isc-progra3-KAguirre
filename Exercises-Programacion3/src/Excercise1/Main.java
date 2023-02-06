package Excercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        int sumNegatives = 0;

        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(new Number(1));
        numbers.add(new Number(2));
        numbers.add(new Number(3));
        numbers.add(new Number(4));
        numbers.add(new Number(5));
        numbers.add(new Number(6));
        numbers.add(new Number(7));
        numbers.add(new Number(8));
        numbers.add(new Number(9));
        numbers.add(new Number(10));
        numbers.add(new Number(-11));
        numbers.add(new Number(-12));
        numbers.add(new Number(-13));
        numbers.add(new Number(-14));
        numbers.add(new Number(-15));


        NumericalClassifier numericalClassifier = new NumericalClassifier(numbers);
        numericalClassifier.classifier();

        for (int i = 0; i < numericalClassifier.getNegativeNumbers().size(); i++) {
            sumNegatives += numericalClassifier.getNegativeNumbers().get(i).getNumber();
        }

        result.add(numericalClassifier.getPositiveNumbers().size());
        result.add(sumNegatives);

        System.out.println("\nThe numbers are:" + numbers);
        System.out.println("\nThe result is: " + result);
    }
}
