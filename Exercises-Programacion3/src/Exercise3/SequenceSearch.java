package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class SequenceSearch {
    public List<Data> search(ArrayList<Data> searchList, ArrayList<Data> sequence) {
        List<Data> result = new ArrayList<>();
        for (int i = 0; i < searchList.size() - sequence.size() + 1; i++) {
            boolean match = true;
            for (int j = 0; j < sequence.size(); j++) {
                if (searchList.get(i + j).getNumber() != sequence.get(j).getNumber()) {
                    match = false;
                    break;
                }
            }
            if (match) {
                result.add(new Data(i));
            }
        }
        return result;
    }
}