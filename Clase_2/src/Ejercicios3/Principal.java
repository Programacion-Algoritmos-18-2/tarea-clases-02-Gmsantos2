package Ejercicios3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerson
 */
public class Principal {
    public static void main(String[] args) {
        Precio p;// se llama a la clase precio 
        p = new Precio(255);// inicializacion de variable conla clase precio con un valor de 225
        
        System.out.println(p.obtener());// presentar el metodo obtener de la clase precio
        
    }
    
}
