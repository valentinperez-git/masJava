import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        //
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cargue el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Cargue el segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("Cargue el tercer numero");
        int num3 = teclado.nextInt();

        //sumar todos los numeros y dividirlos por tres
        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio de los tres numeros es de " + promedio);

    }
}


