import java.util.Scanner;

public class ArregloAscendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números en orden ascendente:");

        // Primer número sin restricción
        System.out.print("Número 1: ");
        numeros[0] = sc.nextInt();

        // Los siguientes deben ser mayores al anterior
        for (int i = 1; i < numeros.length; i++) {
            int num;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                num = sc.nextInt();
                if (num <= numeros[i - 1]) {
                    System.out.println(" El número debe ser mayor que " + numeros[i - 1]);
                }
            } while (num <= numeros[i - 1]);
            numeros[i] = num;
        }

        // Mostrar el arreglo
        System.out.println("\n Números ingresados en orden ascendente:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
        