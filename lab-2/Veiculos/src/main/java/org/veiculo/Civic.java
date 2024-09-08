package org.veiculo;

public class Civic implements IVehicle{
    @Override
    public void start() {
        System.out.println("O Civic ligou!");
    }

    @Override
    public void drive() {
        System.out.println("O Civic está dirigindo!");
    }

    @Override
    public void stop() {
        System.out.println("O Civic parou!");
    }
}