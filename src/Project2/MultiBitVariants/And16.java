package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.And;

public class And16 {

    public boolean[] out = new boolean[16];
    private 3andGates And;
    private And[] andGates = And[16];


    public And16() {
        for (int i = 0; i < 16; i++) {
            andGates[i] = new And();
        }
    }

    public void compute(boolean[] a,boolean[] b){
        for (int i = 0; i < 16; i++) {
            andGates[i].compute(a[i],b[i]);
            out[i]=andGates[i].out;

        }



    }
}
