package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File myFile = new File("/Users/ZZTOP/Desktop/COMSIPRJ4/demo.csv");
        Parser parser = new Parser(myFile);
        Double[] sortedArray = parser.sortAscending();

        Writer writer = new Writer("/Users/ZZTOP/Desktop/COMSIPRJ4/output.csv");
        writer.writeArrayData(sortedArray);
    }
}
