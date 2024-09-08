package org.veiculo;

public class Main {
    public static void main(String[] args) {

        // Usando o Singleton para obter a instância do fabricante Toyota
        IVehicleMaker toyotaFactory = Toyota.getInstance();

        // Criando veículos Toyota usando o Factory Method
        IVehicle corolla = toyotaFactory.makeVehicle("Corolla");
        IVehicle hilux = toyotaFactory.makeVehicle("Hilux");
        IVehicle etios = toyotaFactory.makeVehicle("Etios");

        // Usando o Singleton para obter a instância do fabricante Honda
        IVehicleMaker hondaFactory = Honda.getInstance();

        // Criando veículos Honda usando o Factory Method
        IVehicle city = hondaFactory.makeVehicle("City");
        IVehicle civic = hondaFactory.makeVehicle("Civic");
        IVehicle fit = hondaFactory.makeVehicle("Fit");

        // Toyota
        System.out.println("Toyota:");
        corolla.start();
        corolla.drive();
        corolla.stop();

        System.out.println();

        hilux.start();
        hilux.drive();
        hilux.stop();

        System.out.println();

        etios.start();
        etios.drive();
        etios.stop();

        System.out.println();

        // Honda
        System.out.println("Honda:");
        city.start();
        city.drive();
        city.stop();

        System.out.println();

        civic.start();
        civic.drive();
        civic.stop();

        System.out.println();

        fit.start();
        fit.drive();
        fit.stop();
    }
}
