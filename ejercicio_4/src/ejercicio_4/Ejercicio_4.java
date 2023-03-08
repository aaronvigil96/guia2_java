/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos grados hace?");
        int grados = entrada.nextInt();
        int farenheit = 32 + (9 * grados / 5);
        System.out.println("Si hace " + grados + " grados, entonces el equivalente en Farenheit son: " + farenheit);
    }
    
}
