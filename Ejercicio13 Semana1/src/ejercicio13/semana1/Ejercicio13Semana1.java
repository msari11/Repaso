/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13.semana1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio13Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Realiza una aplicación que nos pida un número de ventas a introducir, 
        //después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
        //Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
        Scanner sc = new Scanner(System.in);
        int num, venta, sumaTotal=0;
        System.out.println("Digite el numero de ventas");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Digite la venta " +i);
            venta = sc.nextInt();
            sumaTotal += venta;
        }
        System.out.println("La suma total es "+sumaTotal);
    }
    
}
