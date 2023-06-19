// Hacer un programa que permita al usuario ingresar 5 números y mostrarlos
import java.util.Scanner;

public class CincoNumeros{
    public static void main(String[] args) {
       int [] numeros = new int [5];
       Scanner teclado= new Scanner (System.in);

    int contador= 0;
    while (contador < 5) {
       System.out.println("Ingrese un numero:");
       int numero= teclado.nextInt();
            numeros[contador]= numero;
            contador++;
    }
        contador= 0;
        while (contador < 5) {
            System.out.print(numeros [contador]);
        contador++;
        }
            }
    }
