package org.veiculo;

public class Corolla implements IVehicle{
    @Override
    public void start() {
        System.out.println("O Corolla ligou!");
    }

    @Override
    public void drive() {
        System.out.println("O Corolla está dirigindo!");
    }

    @Override
    public void stop() {
        System.out.println("O Corolla parou!");
    }
}
