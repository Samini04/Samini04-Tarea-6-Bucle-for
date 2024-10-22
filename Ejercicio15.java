import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSuma = 0;
        int multi = 1;  // Se inicializa en 1 porque es una multiplicación.

        System.out.print("Ingrese un número n: ");
        int n = sc.nextInt();  // El número n es el límite para el bucle.

        for (int contador = 1; contador <= n; contador++) {
            totalSuma += contador;  // Suma acumulativa
            multi *= contador;  // Producto acumulativo
        }

        System.out.println("La suma es: " + totalSuma);
        System.out.println("El producto es: " + multi);
    }
}
