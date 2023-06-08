import java.util.Scanner;
import java.util.Random;

public class Adivina{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.print("Piensa y Adivina el número entre 1 y 100: ");
        int numeroAdivinado = scanner.nextInt();

        if (numeroAdivinado == numeroAleatorio) {
            System.out.println("¡Felicidades! Adivinaste el número.");
        } else {
            System.out.printf("No acertaste, el número era %d.", numeroAleatorio);
        }
    }
}
