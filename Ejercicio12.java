import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int num=1; num<=10; num++)
        {
            System.out.println("Introduce un número: " );
            num = sc.nextInt();
            for (int multi=1; multi<=10; multi++) {
                System.out.println(num +" X " + multi +" = " + (num*multi) );
            }

        }
    }
}
