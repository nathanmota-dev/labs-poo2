package org.veiculo;

public class City implements IVehicle{
    @Override
    public void start() {
        System.out.println("O City ligou!");
    }

    @Override
    public void drive() {
        System.out.println("O City está dirigindo!");
    }

    @Override
    public void stop() {
        System.out.println("O City parou!");
    }
}
