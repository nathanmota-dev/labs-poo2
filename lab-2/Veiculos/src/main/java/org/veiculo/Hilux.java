package org.veiculo;

public class Hilux implements IVehicle{
    @Override
    public void start() {
        System.out.println("O Hilux ligou!");
    }

    @Override
    public void drive() {
        System.out.println("O Hilux está dirigindo!");
    }

    @Override
    public void stop() {
        System.out.println("O Hilux parou!");
    }
}