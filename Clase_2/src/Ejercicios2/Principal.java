package Ejercicios2;

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
        Scanner entrada = new Scanner(System.in);
        Precio p;
        p = new Precio();
        p.agregar(20.0);
        System.out.println(p.obtener());
        
    }
    
}
