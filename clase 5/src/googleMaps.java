import java.util.Scanner;

public class googleMaps {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escriba el lugar: ");
        String lugar = teclado.nextLine();

        System.out.println("https://www.google.com/maps/search/" + lugar);
    }
}
