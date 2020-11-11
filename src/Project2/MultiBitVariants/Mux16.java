package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.Mux;

public class Mux16 {
    public boolean[] out = new boolean[16];
    private Mux[] muxGates = new Mux[16];


    public Mux16() {

        for (int i = 0; i < 16; i++) {
            muxGates[i] = new Mux();
        }
    }

    public void compute(boolean[] a,boolean[] b,boolean[] sel){
        for (int i = 0; i < 16; i++) {

            muxGates[i].compute(a[i],b[i],sel[i]);
            out[i]=muxGates[i].out;
        }
    }
}

