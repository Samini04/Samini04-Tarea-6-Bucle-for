import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int num=10; num>=1; num--)
        {
            System.out.println("Introduce un número: " );
            num = sc.nextInt();
            System.out.println("Tabla de multiplicar del 5 al revés: ");

         for (int multi=10; multi>=1; multi--) {

             System.out.println( num +" X " + multi +" = " + (num*multi) );
            }

        }
    }
}

