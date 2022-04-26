package com.iuc.master.tl.traitement;

public class Calculatrice {

    public Calculatrice() {
        super();
    }

    public double addition(double nbre1, double nbre2) {
        return nbre1 + nbre2;
    }

    public double soustraction(double nbre1, double nbre2) {
        return nbre1 - nbre2;
    }

    public double multiplication(double nbre1, double nbre2) {
        return nbre1 * nbre2;
    }

    public double division(double nbre1, double nbre2) {
        if (nbre2 != 0) {
            return nbre1 / nbre2;
        }
        else {
            return Double.NaN;
        }
    }
}
