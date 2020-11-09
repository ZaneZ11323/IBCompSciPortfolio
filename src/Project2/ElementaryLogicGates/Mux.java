package Project2.ElementaryLogicGates;

public class Mux {


    public boolean out;
    Not not1 = new Not();
    And and1 = new And();
    And and2 = new And();
    Or  or1 = new Or();

    public Mux() {

    }

    public void compute(boolean a, boolean b, boolean sel){
    not1.compute(sel);
    and1.compute(a,sel);
    and2.compute(b, not1.out );
    or1.compute(and1.out, and2.out);
    or1.out=out;
    }
}
