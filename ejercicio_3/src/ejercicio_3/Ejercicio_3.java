/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;
import java.util.Scanner;
/**
 *
 * @author Aaron
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresá una frase");
        String frase = entrada.nextLine();
        frase = frase.toUpperCase();
        System.out.println(frase);
        frase = frase.toLowerCase();
        System.out.println(frase);
    }
}
