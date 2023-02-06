package Exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Term term = new Term(2,"x");
        Term term1 = new Term(9,"y");
        Term independentTerm = new Term(2);

        ArrayList<Term> equation1 = new ArrayList<>();
        equation1.add(term);
        equation1.add(term1);
        equation1.add(independentTerm);

        Term term2 = new Term(16,"x");
        Term term3 = new Term(5,"y");
        Term independentTerm1 = new Term(36);

        ArrayList<Term> equation2 = new ArrayList<>();
        equation2.add(term2);
        equation2.add(term3);
        equation2.add(independentTerm1);

        SumEquations sumEquations = new SumEquations();

        String result = String.valueOf(sumEquations.sumEquations(equation1,equation2));

        System.out.println("\nThe sum of the two equations is:" + result);
    }
}
