package Exercise3;

public class Data {
    private int number;

    public Data (int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}