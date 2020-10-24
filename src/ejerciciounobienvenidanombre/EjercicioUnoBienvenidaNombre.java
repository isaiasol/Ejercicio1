/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciounobienvenidanombre;
import java.util.Scanner;
/**
 *
 * @author OrtizL
 */
public class EjercicioUnoBienvenidaNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String nombre;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        nombre=teclado.nextLine();
        System.out.println("Bienvenido(a) " + nombre);
    }
    
}
