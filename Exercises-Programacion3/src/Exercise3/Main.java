package Exercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Data> searchList = new ArrayList<>();
        searchList.add(new Data(7));
        searchList.add(new Data(4));
        searchList.add(new Data(9));
        searchList.add(new Data(2));
        searchList.add(new Data(15));
        searchList.add(new Data(3));
        searchList.add(new Data(4));
        searchList.add(new Data(8));
        searchList.add(new Data(1));
        searchList.add(new Data(5));
        searchList.add(new Data(8));
        searchList.add(new Data(2));
        searchList.add(new Data(15));
        searchList.add(new Data(11));
        searchList.add(new Data(13));
        searchList.add(new Data(17));
        searchList.add(new Data(14));

        ArrayList<Data> sequentialList = new ArrayList<>();
        sequentialList.add(new Data(2));
        sequentialList.add(new Data(15));

        SequenceSearch sequenceSearch = new SequenceSearch();
        System.out.println("The result is: " + sequenceSearch.search(searchList,sequentialList));
    }
}
