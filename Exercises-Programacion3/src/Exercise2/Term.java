package Exercise2;

public class Term {
    private int coefficient;
    private String unknown;

    public Term(int coefficient, String unknown) {
        this.coefficient = coefficient;
        this.unknown = unknown;
    }

    public Term(int independentTerm){
        this.coefficient = independentTerm;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public String getUnknown() {
        return unknown;
    }

    public String signCoefficient(int number){
        if (number>0){
            return "+ ";
        }
        return "";
    }
}
