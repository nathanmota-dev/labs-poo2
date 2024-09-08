package org.veiculo;

public class Fit implements IVehicle{
    @Override
    public void start() {
        System.out.println("O Fit ligou!");
    }

    @Override
    public void drive() {
        System.out.println("O Fit está dirigindo!");
    }

    @Override
    public void stop() {
        System.out.println("O Fit parou!");
    }
}
