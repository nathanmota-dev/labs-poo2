package org.celular;

public class Galaxy8 implements Celular{

    @Override
    public void fazLigacao() {
        System.out.println("O Galaxy 8 fez uma ligação");
    }

    @Override
    public void tiraFoto() {
        System.out.println("O Galaxy 8 tirou uma foto");
    }
}
