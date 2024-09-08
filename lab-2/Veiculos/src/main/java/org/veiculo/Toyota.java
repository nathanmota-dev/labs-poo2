package org.veiculo;

public class Toyota implements IVehicleMaker {

    private static Toyota instance;

    // Construtor privado para impedir a criação de novas instâncias
    private Toyota() {}

    // Método estático que retorna a única instância de Toyota (Singleton)
    public static Toyota getInstance() {
        if (instance == null) {
            instance = new Toyota(); // Cria a instância se ainda não existir
        }
        return instance;
    }

    // O Factory Method foi escolhido e cria veículos da Toyota com base no modelo fornecido
    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equals("Corolla")) {
            return new Corolla();
        } else if (modelo.equals("Hilux")) {
            return new Hilux();
        } else if (modelo.equals("Etios")) {
            return new Etios();
        } else {
            return null;
        }
    }
}
