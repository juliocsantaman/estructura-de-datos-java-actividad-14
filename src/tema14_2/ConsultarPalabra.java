/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema14_2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class ConsultarPalabra {
    
    public void consultar(String buscPal) {
        File archivo;
        FileReader leer;
        String cadena, palabra="", definicion="";
        BufferedReader almacenamiento;
        boolean palEncontrada=false;
        
        archivo=new File("diccionario.txt");
        try {
            leer=new FileReader(archivo);
            almacenamiento=new BufferedReader(leer);
            cadena="";
            while(cadena!=null) {
                try {
                    cadena=almacenamiento.readLine();
                    palabra=cadena;
                    cadena=almacenamiento.readLine();
                    definicion=cadena;
                    
                    if(cadena!=null) {
                        if(buscPal.equals(palabra)) {
                            
                            System.out.println("Palabra: " + palabra);
                            System.out.println("Definición: " + definicion);
                            palEncontrada=true;
                        }
                        
                        
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ConsultarPalabra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(!palEncontrada) {
                System.out.println("No se econtró la palabra a buscar.");
                System.out.println("Te vamos a dar la opción de que ingreses la palabra y su definición.");
                InsertarPalabra obj=new InsertarPalabra();
                obj.agregar();
            }
            
            try {
                almacenamiento.close();
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(ConsultarPalabra.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConsultarPalabra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public int calcularCantidadPalabras() {
        int n=0;
        try {
            FileReader fr = new FileReader("diccionario.txt");
            BufferedReader br = new BufferedReader(fr);
            
            //System.out.println("El fichero tiene " + br.lines().count() + " líneas.");
            n = (int) br.lines().count();
            //System.out.println("Número de palabras: " + (n/2));
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ConsultarPalabra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConsultarPalabra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return n/2;
        
        
    }
    
    
    
}
