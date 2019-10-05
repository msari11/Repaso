/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.semana1;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author Laboratorio
 */
public class Ejercicio5Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado 
        //(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y 
        //el método pow de Math.
        double num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el radio");
        num1 = sc.nextDouble();
        System.out.println("El area del circulo es " +(Math.PI * Math.pow(num1, 2)));
    }
    
}
