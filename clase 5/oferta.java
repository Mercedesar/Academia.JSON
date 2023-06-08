import java.util.Scanner;

public class oferta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio original de la harina PAN: ");
        double precioOriginal = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.printf("El precio final después de aplicar el descuento es: %.2f", precioFinal);
    }
}
