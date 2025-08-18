public class NumeroMenor {
    
    // Función que devuelve el menor de 3 números decimales
    public static double menor(double a, double b, double c) {
        double min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        double n1 = 4.7, n2 = 2.3, n3 = 5.9;

        double resultado = menor(n1, n2, n3);

        System.out.println("El menor de los tres números es: " + resultado);
    }
}
