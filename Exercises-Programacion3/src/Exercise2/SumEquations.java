package Exercise2;

import java.util.ArrayList;

public class SumEquations {
    private ArrayList<String> result;

    public ArrayList<String> sumEquations(ArrayList<Term> equation1,ArrayList<Term> equation2){
        result = new ArrayList<>();

        for (int i = 0; i < equation1.size(); i++) {
            if (equation1.get(i).getUnknown() == "x"){
                result.add(equation1.get(i).getCoefficient() + equation2.get(i).getCoefficient()+"x");
            }else if (equation1.get(i).getUnknown() == "y"){
                int resultCoefficientY = equation1.get(i).getCoefficient() + equation2.get(i).getCoefficient();
                result.add(equation1.get(i).signCoefficient(resultCoefficientY)+resultCoefficientY+"y");
            } else {
                result.add("= "+(equation1.get(i).getCoefficient() + equation2.get(i).getCoefficient()));
            }
        }
        return result;
    }
}
