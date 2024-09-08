package org.celular;

public class Apple implements fabricanteCelular{

    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals("IphoneX")){
            return new IphoneX();
        }else if (modelo.equals("IphoneS")){
            return new IphoneS();
        }
        else{
            return null;
        }
    }
}
