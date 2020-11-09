package Project2.ElementaryLogicGates;

public class Dmux {

    public boolean a;
    public boolean b;
    private And and1;
    private Not not1;
    private And and2;

    public Dmux() {
    and1 = new And();
    and2 = new And();
    not1 = new Not();


    }

    public void compute(boolean in, boolean sel){
    and1.compute(in, not1.out);
    not1.compute(sel);
    a=and1.out;
    and2.compute(in,sel);
    b=and2.out;





    }
}
