/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.semana1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio6Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
        //Si no lo es, también debemos indicarlo.
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite un numero");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        
    }
    
}
