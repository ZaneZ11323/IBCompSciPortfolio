package Project2.ElementaryLogicGates;

public class Or {

    public boolean out;
    private Nand nand1;
    private Nand nand2;
    private Nand nand3;

    public Or() {
        nand1 = new And;
        nand2= new And;
        nand3 = new And;

    }

    public void compute(boolean a, boolean b){
    nand1.compute(a);
    nand2.compute(b);
    nand3.compute(nand1.out, nand2.out);
    out = nand3.out;
    }

}
