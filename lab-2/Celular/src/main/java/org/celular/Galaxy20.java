package org.celular;

public class Galaxy20 implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("O Galaxy 20 fez uma ligação");
    }

    @Override
    public void tiraFoto() {
        System.out.println("O Galaxy 20 tirou uma foto");
    }
}
