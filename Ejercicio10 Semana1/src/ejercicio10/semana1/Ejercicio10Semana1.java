/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.semana1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio10Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
        Scanner sc = new Scanner(System.in);
        int num=1;
        while(num<=100){
            System.out.println(num);
            num++;
        }
    }
    
}
