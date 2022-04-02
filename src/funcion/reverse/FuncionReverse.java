/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion.reverse;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FuncionReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nombre o alguna palabra: ");
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
       System.out.println("¡Invertido es!");
        StringBuilder builder=new StringBuilder(nombre);
        String sCadenaInvertida=builder.reverse().toString();
        System.out.println(sCadenaInvertida);
    }
    
}
