package Excercise1;

import java.util.ArrayList;

public class NumericalClassifier {
    ArrayList<Number> numbers;
    ArrayList<Number> positiveNumbers;
    ArrayList<Number> negativeNumbers;

    public NumericalClassifier(ArrayList<Number> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Number> classifier(){
        positiveNumbers = new ArrayList<>();
        negativeNumbers = new ArrayList<>();
        for (int i = 0;i <numbers.size();i++){
            if (numbers.get(i).numberPositive()){
                positiveNumbers.add(numbers.get(i));
            }else
                negativeNumbers.add(numbers.get(i));
        }
        return null;
    }

    public ArrayList<Number> getPositiveNumbers() {
        return positiveNumbers;
    }

    public ArrayList<Number> getNegativeNumbers() {
        return negativeNumbers;
    }
}
