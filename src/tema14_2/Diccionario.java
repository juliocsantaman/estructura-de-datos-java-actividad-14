/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema14_2;


import java.util.Scanner;


/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Diccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        InsertarPalabra obj = new InsertarPalabra();
        ConsultarPalabra obj2 = new ConsultarPalabra();
        String buscPal="";
        String res="";
        
        do {
            System.out.println("***** DICCIONARIO *****");
            System.out.println("Número de palabras en el diccionario: " + obj2.calcularCantidadPalabras() + ".");
            System.out.print("Escribe la palabra a buscar: ");
            buscPal = entrada.next();

            //obj.agregar();
            obj2.consultar(buscPal.toUpperCase());
            
            do {
                System.out.println("¿Deseas volver a consultar una palabra?");
                System.out.print("Escribe si o no: ");
                res = entrada.next();
                res = res.toLowerCase();
                
                if(!res.equals("si") && !res.equals("no")) {
                    System.out.println("No has escrito una respuesta correcta.");
                    System.out.println("Recuerda que solo es si o no.");
                }
                
            } while (!res.equals("si") && !res.equals("no"));
            
            System.out.println();
            
        } while (res.equals("si"));
        
        
        
        
    }
    
}
