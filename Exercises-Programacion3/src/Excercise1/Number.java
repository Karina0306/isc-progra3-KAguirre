package Excercise1;

public class Number {
    int number;

    public Number(int number) {
        this.number = number;
    }

    public boolean numberPositive(){
        return number>0;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
