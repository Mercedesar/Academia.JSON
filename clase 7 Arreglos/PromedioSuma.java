//Un promedio de notas tal vez 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;

        while (contador < 5) {
            System.out.println("Ingrese un numero:");
            numeros[contador] = teclado.nextInt();
            suma += numeros[contador];
            contador++;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double promedio = (double) suma / 5;

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio es: " + promedio);
    }
}
