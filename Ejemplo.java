import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media=0;
        for (int num=1; num<=5; num++){

            System.out.println("Dime un numero:"+ num+ " de 5 ");
            num= sc.nextInt();
            media+=num;
        }
        System.out.println("La media es :"+ media/2);
    }
}
