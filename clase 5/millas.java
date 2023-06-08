//Calculadora de Millas+km 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una distancia en millas: ");
        double millas = input.nextDouble();
        double kilometros = millas * 1.60934;
        System.out.println(millas + " millas son " + kilometros + " kilómetros.");
    }
}
