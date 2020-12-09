package Project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser<sum> {
    public Scanner scanner;

    public Parser(File file) {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("no joy");
            e.printStackTrace();
        }
    }

    public void printData(){
        while(scanner.hasNext()){
            System.out.println(scanner.next());

        }
    }



    public double finaAvrage() {
        double sum = 0;

        while (scanner.hasNext()) {
            int i = 0;
            i++;
            Double sum = Double.valueOf(scanner.next());

            System.out.println(sum / i);

            return sum / i;
        }


        return sum;


    }}