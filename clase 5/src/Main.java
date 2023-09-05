import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //cargar tres numeros, mostrar el menor y mayor
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cargue el primer numero");
        int numero1 = teclado.nextInt();
        System.out.println("Cargue el segundo numero");
        int numero2 = teclado.nextInt();
        System.out.println("Cargue el tercer numero");
        int numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("el numero mas grande es el " + numero1);
        }
        if (numero2 > numero3 && numero2 > numero1) {
            System.out.println("el numero mas grande es el " + numero2);
        }
        if (numero3 > numero2 && numero3 > numero1) {
            System.out.println("el numero mas grande es el " + numero3);
        }
    }
}
