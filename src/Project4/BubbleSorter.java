package Project4;

import javax.swing.text.Element;

public class BubbleSorter implements Sorter{

    @Override
    public Double[] sort(Double[] values) {

        Double[] sortedValues = values;

        for (int i = 0; i < values.length-1; i++) {
            for (int j = 0; j < values.length-1-i; j++) {
                if (sortedValues[j]>sortedValues[j+1]){
                    double temp = sortedValues[j];
                    sortedValues[j]=sortedValues[j+1];
                    sortedValues[j+1]=temp;
                }
            }

    }
        return sortedValues;

    }
}
