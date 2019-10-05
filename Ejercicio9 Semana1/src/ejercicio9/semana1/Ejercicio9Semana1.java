/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.semana1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio9Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y 
        //calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
        Scanner sc = new Scanner(System.in);
        double precio, precioFinal;
        final double iva = 0.21;
        System.out.println("Digite el precio del producto");
        precio = sc.nextDouble();
        precioFinal = precio+(precio*iva);
        System.out.println("El precio final es "+precioFinal);
        
    }
    
}
