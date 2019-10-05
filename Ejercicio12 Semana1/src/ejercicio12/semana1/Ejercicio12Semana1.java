/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12.semana1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio12Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. 
        //Utiliza el bucle que desees
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1;i<=100;i++){
            if(i%2==0 && i%3==0){
                System.out.println(i);
            }
        }
    }
    
}
