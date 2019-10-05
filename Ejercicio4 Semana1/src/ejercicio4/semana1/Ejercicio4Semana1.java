/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.semana1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio4Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir 
//        (recuerda usar JOptionPane)
        String nombre ="";
        nombre = JOptionPane.showInputDialog(null, "Digite su nombre");
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre, "Mensaje", 1);
    }
    
}
