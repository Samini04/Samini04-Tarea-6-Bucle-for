public class Ejercicio11 {
    public static void main(String[] args) {

        // a.
        System.out.print("a. ");
        for (int num = 1, contador = 1; num < 8; num++) {
            System.out.print( (num + contador) + " "); // Usar print para mantenerlos en la misma línea
        }
        System.out.println(); // Salto de línea al final del bloque

        // b.
        System.out.print("b. ");
        for (int num = 0, contador = 1; num < 10; num += 2) {
            System.out.print((num + contador) + " "); // Usar print para mantenerlos en la misma línea
        }
        System.out.println(); // Salto de línea al final del bloque

        // c.
        System.out.print("c. ");
        for (int num = 9; num >= 1; num--) {
            System.out.print(num + " "); // Usar print para mantenerlos en la misma línea
        }
        System.out.println(); // Salto de línea al final del bloque

        // d.
        System.out.print("d. ");
        for (int num = 9; num >= 1; num -= 2) {
            System.out.print(num + " "); // Usar print para mantenerlos en la misma línea
        }
        System.out.println(); // Salto de línea al final del bloque
    }
}
