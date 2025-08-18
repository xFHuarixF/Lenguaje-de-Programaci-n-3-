import java.util.Scanner;

public class TiempoEnSegundos {
    
    // Función que convierte horas, minutos y segundos a solo segundos
    public static int convertirASegundos(int horas, int minutos, int segundos) {
        return (horas * 3600) + (minutos * 60) + segundos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese las horas: ");
        int horas = sc.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Ingrese los segundos: ");
        int segundos = sc.nextInt();

        // Cálculo
        int totalSegundos = convertirASegundos(horas, minutos, segundos);

        // Salida
        System.out.println("\nEl equivalente en segundos es: " + totalSegundos);
    }
}
