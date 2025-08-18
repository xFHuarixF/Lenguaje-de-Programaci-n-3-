import java.util.Random;
public class LanzarDado {
    public static void main(String[] args) {
        int[] frecuencia = new int[6]; // arreglo para guardar la frecuencia de las 6 caras
        Random rand = new Random();

        int lanzamientos = 20000;

        // Simulación de lanzamientos
        for (int i = 0; i < lanzamientos; i++) {
            int cara = rand.nextInt(6) + 1; // genera número entre 1 y 6
            frecuencia[cara - 1]++; // se guarda en el índice correspondiente
        }

        // Mostrar resultados
        System.out.println("Frecuencia de cada cara después de " + lanzamientos + " lanzamientos:");
        for (int i = 0; i < frecuencia.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + frecuencia[i]);
        }
    }
}

