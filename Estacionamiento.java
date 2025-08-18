public class Estacionamiento {
    
    // Función que calcula el cargo según las horas
    public static double calcularCargo(int horas) {
        double cargo;

        if (horas <= 0) {
            cargo = 0; // No hay horas, no hay cobro
        } else if (horas == 1) {
            cargo = 3.00;
        } else {
            cargo = 3.00 + (horas - 1) * 0.50;
        }

        // Aplicar cargo máximo por día
        if (cargo > 12.00) {
            cargo = 12.00;
        }

        return cargo;
    }

    public static void main(String[] args) {
        int horas = 10;

        double total = calcularCargo(horas);

        System.out.println("Horas: " + horas + " → Cargo: S/" + total);
    }
}
