/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AlumnoUTM
 */
public class PrimerPrograma {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        
        String nombre;
        System.out.println("Introduzca su nombre: ");
        nombre = entrada.readLine();
        System.out.println("Su nombre es "+nombre);
        System.out.println("------------------");
    }
    
}
