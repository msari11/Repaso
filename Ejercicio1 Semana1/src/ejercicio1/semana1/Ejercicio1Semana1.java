/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.semana1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio1Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1 = 20, num2 = 6;
        System.out.println("Suma: " +(num1+num2));
        System.out.println("Resta: " +(num1-num2));
        System.out.println("Multiplicacion: " +(num1*num2));
        System.out.println("Division: " +(num1/num2));
        System.out.println("Modulo: " +(num1%num2));
    }
    
}
