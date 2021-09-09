package br.inatel.cdg.algebra.scene;

public class Reta {
    Ponto p1;
    Ponto p2;
    double resp;

    double coeficiente() {
        resp = ((p2.Y - p1.Y) / (p2.x) - p1.x);
        System.out.println(resp);
        return resp;
    }

    double linear(double resp2) {
        resp2 = (p1.Y - (resp * p1.x));
        System.out.println(resp2);
        return resp2;
    }
}