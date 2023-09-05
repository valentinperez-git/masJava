import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        //
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cargue el numero");
        int num1 = teclado.nextInt();

        int resto = num1 % 2;
        if(resto == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

    }
}
