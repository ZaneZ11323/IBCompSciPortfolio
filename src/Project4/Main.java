package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //File myFile = new File("/Users/ZZTOP/Desktop/COMSIPRJ4/demo.csv");
        File myFile = new File("C:\\Users\\janderson\\Documents\\IB_Comp_Sci\\Student_Portfolios\\Zane\\IBCompSciPortfolio\\src\\Project4\\rawData.csv");
        Parser parser = new Parser(myFile);
        Double[] sortedArray = parser.sortAscending();

        //Writer writer = new Writer("/Users/ZZTOP/Desktop/COMSIPRJ4/output.csv");
        Writer writer = new Writer("C:\\Users\\janderson\\Documents\\IB_Comp_Sci\\Student_Portfolios\\Zane\\IBCompSciPortfolio\\src\\Project4\\sorted.csv");
        writer.writeArrayData(sortedArray);
    }
}
