//Porcentaje de Propina que se le da al mesero por su atención
import java.util.Scanner;

public class Propina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de la cuenta en el restaurante: ");
        double totalCuenta = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de propina que desea dejar: ");
        double porcentajePropina = scanner.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);

        System.out.printf("La propina a dejar es: %.2f", propina);
    }
}
