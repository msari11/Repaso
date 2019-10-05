/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.semana1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio7Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
        //Por ejemplo: si introduzco un 97, me muestre una a.
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Digite un numero");
        num = sc.nextInt();
        char letra = (char)num;
        System.out.println(letra);
    }
    
}
