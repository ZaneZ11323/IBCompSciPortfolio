package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File myFile = new File("/Users/ZZTOP/Desktop/COMSIPRJ4/demo.csv");
        Parser parser = new Parser(myFile);
        parser.findAvrage();

        Writer writer = new Writer("/Users/ZZTOP/Desktop/COMSIPRJ4/output.csv");
        writer.writeData("Big Z's File");
    }
}
