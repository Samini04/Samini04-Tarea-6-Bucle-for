import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primero numero:");
        int a=0;
        a = sc.nextInt();

        System.out.println("Introduce el segundo numero:");
        int b=0;
        b = sc.nextInt();

        int resultado= 1;

        for (int contador=1; contador<=b; contador++ ) {

           resultado*=a;

        }
        System.out.println("El resultado es: " + resultado);

    }
}
