/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.semana1;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio2Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Declara 2 variables numéricas (con el valor que desees), e indica cual es mayor de los dos. 
//        Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
        int num1 = 3, num2 = 8;
        if (num1 > num2){
            System.out.println("El numero mayor es " + num1);
        }else if(num1==num2){
            System.out.println("Los números son iguales");
        }
        else{
            System.out.println("El numero mayor es " + num2);
        }
        
    }
    
}
