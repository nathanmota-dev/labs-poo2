package org.veiculo;

public class Etios implements IVehicle{
    @Override
    public void start() {
        System.out.println("O Etios ligou!");
    }

    @Override
    public void drive() {
        System.out.println("O Etios está dirigindo!");
    }

    @Override
    public void stop() {
        System.out.println("O Etios parou!");
    }
}
