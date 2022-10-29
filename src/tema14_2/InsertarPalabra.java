/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema14_2;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class InsertarPalabra {
    
    public void agregar() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String palabra="", definicion="";
        archivo=new File("diccionario.txt");
        
        if(!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.print("Escribe la palabra: ");
                palabra = entrada.next();
                System.out.print("Escribe la definicion: ");
                entrada.nextLine();
                definicion = entrada.nextLine();
                
                escribir=new FileWriter(archivo, true);
                linea=new PrintWriter(escribir);
                linea.println(palabra.toUpperCase());
                linea.println(definicion.toLowerCase());
                linea.close();
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(InsertarPalabra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            
            try {
                
                System.out.print("Escribe la palabra: ");
                palabra = entrada.next();
                System.out.print("Escribe la definicion: ");
                entrada.nextLine();
                definicion = entrada.nextLine();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println(palabra.toUpperCase());
                linea.println(definicion.toLowerCase());
                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(InsertarPalabra.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
        
        
    }
    
}
