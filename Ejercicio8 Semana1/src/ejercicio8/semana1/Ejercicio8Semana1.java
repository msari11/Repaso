/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.semana1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio8Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) 
        //y muestre su código en la tabla ASCII.
        Scanner sc = new Scanner(System.in);
        int num;
        char letra;
        System.out.println("Digite una letra");
        letra = sc.next().charAt(0);
        num = (int)letra;
        System.out.println(num);
    }
    
}
