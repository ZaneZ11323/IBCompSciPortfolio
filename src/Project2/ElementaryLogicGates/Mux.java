package Project2.ElementaryLogicGates;

public class Mux {

    public boolean out;
    Not not1 = new Not();

    public Mux() {

    }

    public void compute(boolean a, boolean b, boolean sel){
    not1.compute(sel);
    }
}
