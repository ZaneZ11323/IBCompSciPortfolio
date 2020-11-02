package Project2.ElementaryLogicGates;

public class Xor {
    public boolean out;
    private Nand nand1;
    private Nand nand2;
    private Nand nand3;
    private Nand nand4;

    public Xor() {
    nand1 = new Nand();
    nand2 = new Nand();
    nand3 = new Nand();
    nand4 = new Nand();

    }

    public void compute(boolean a, boolean b){
     nand1.compute(a,b);
     nand2.compute(a, nand1.out);
     nand3.compute(nand1.out, b);
     nand4.compute(nand2.out, nand3.out);
     out= nand4.out;
    }
}
