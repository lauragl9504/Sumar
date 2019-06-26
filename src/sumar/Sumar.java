/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumar;

import java.util.Scanner;

/**
 *
 * @author technology
 */
public class Sumar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner res = new Scanner(System.in);
        String respuesta = "si";
        int suma = 0;
        
        System.out.println("¿Desea ingresar valores para sumar?");
        respuesta = res.next();
        
        while (respuesta.equals("si"))
        {
            
            int valor = 0;
            System.out.println("Ingrese el valor a sumar: ");
            valor = res.nextInt();
            suma = suma + valor;
            System.out.println("¿Desea ingresar valores para sumar?");
            respuesta = res.next();
        }
        
        System.out.println("El resultado es: " + suma);
        
    }
    
}
