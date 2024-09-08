package org.veiculo;

public class Honda implements IVehicleMaker {

    private static Honda instance;

    // Construtor privado para impedir a criação de novas instâncias
    private Honda() {}

    // Método estático que retorna a única instância de Honda (Singleton)
    public static Honda getInstance() {
        if (instance == null) {
            instance = new Honda(); // Cria a instância se ainda não existir
        }
        return instance;
    }

    // O Factory Method foi escolhido e cria veículos da Honda com base no modelo fornecido
    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equals("City")) {
            return new City();
        } else if (modelo.equals("Civic")) {
            return new Civic();
        } else if (modelo.equals("Fit")) {
            return new Fit();
        } else {
            return null;
        }
    }
}
