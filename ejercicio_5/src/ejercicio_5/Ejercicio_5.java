/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;
import java.util.Scanner;
/**
 *
 * @author Aaron
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresá un numero");
        int numero = entrada.nextInt();
        double raiz = Math.sqrt(numero);
        System.out.println("El doble de " + numero + " es: " + (numero + numero));
        System.out.println("El triple de " + numero + " es: " + (numero + numero + numero));
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
    }
}
