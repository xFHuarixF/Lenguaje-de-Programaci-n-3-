public class SumaArreglo {
    // Función que recibe un arreglo y devuelve la suma de sus elementos
    public static int sumarElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado = sumarElementos(numeros);
        System.out.println("La suma de los elementos es: " + resultado);
    }
}
