import java.util.Scanner;

public class EdadPerro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro");
        int edad = scanner.nextInt();
        System.out.println("La edad de su perro es " + calcularEdadPerros(edad) + " anos");
    }

    public static int calcularEdadPerros(int edadPerro) {
        return edadPerro * 7;
    }
}
