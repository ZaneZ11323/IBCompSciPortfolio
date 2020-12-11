package Project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser<sum> {
    //instance arrays
    public Scanner scanner;
    int numValues=5;
    public Double[] unsortedValues = new Double[numValues];

    public Parser(File file) {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("no joy");
            e.printStackTrace();

        }
         readDataIntoArray();
    }

    public void readDataIntoArray(){
        for (int i = 0; i < numValues; i++) {
            unsortedValues[i]=Double.valueOf(scanner.next());
            //System.out.println(unsortedValues.toString());
        }
    }

        public Double[] sortAscending(){
        BubbleSorter bs = new BubbleSorter();
          return bs.sort(unsortedValues);

       }




        public void printData(){
            while(scanner.hasNext()){
                System.out.println(scanner.next());

            }
        }

    public double findAvrage() {
        double sum = 0;

        while (scanner.hasNext()) {
            int i = 0;
            i++;
            sum = Double.valueOf(scanner.next());

            System.out.println(sum / i);

            return sum / i;
        }


        return sum;

    }
}