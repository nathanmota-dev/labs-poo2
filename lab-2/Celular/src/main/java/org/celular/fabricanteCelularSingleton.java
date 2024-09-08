package org.celular;

public class fabricanteCelularSingleton {

    private  static Apple apple;

    private static Samsung samsung;

    public static fabricanteCelular getInstance(String fabricante){
        if(fabricante.equals("apple")){
            if(apple == null){
                apple = new Apple();
            }
            return apple;
        } else{
            if(samsung == null){
                samsung = new Samsung();
            }
            return samsung;
        }
    }

}
