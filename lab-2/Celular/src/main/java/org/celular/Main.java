package org.celular;

public class Main {
    public static void main(String[] args) {
        fabricanteCelularSingleton singleton = new fabricanteCelularSingleton();

        //Apple

        fabricanteCelular fabrinteApple = singleton.getInstance("apple");

        Celular iphoneX = fabrinteApple.constroiCelular("IphoneX");
        iphoneX.fazLigacao();
        iphoneX.tiraFoto();

        Celular iphoneS = fabrinteApple.constroiCelular("IphoneS");
        iphoneS.fazLigacao();
        iphoneS.tiraFoto();

        //Samsung

        fabricanteCelular fabrinteSamsung = singleton.getInstance("samsung");

        Celular galaxy8 = fabrinteSamsung.constroiCelular("Galaxy8");
        galaxy8.fazLigacao();
        galaxy8.tiraFoto();

        Celular galaxy20 = fabrinteSamsung.constroiCelular("Galaxy20");
        galaxy20.fazLigacao();
        galaxy20.tiraFoto();
    }
}
