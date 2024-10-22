import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de n: ");
        int n=0;
        n = sc.nextInt();
        System.out.println("Introduce el valor de m: ");
        int m=0;
        m= sc.nextInt();
        int sumaPares=0;
        int sumaImpares=0;

        for (int contador=n; contador<=m; contador++) {

            if (contador%2 == 0 ) {
                sumaPares+=contador;
            }
            else {
                sumaImpares+=contador;
            }
        }
        System.out.println("La suma de los numeros Pares entre " +n+ " y " +m+ " es: " + sumaPares );
        System.out.println("La suma de los numeros Impares entre " +n+ " y " +m+ " es: " + sumaImpares );
    }
}
