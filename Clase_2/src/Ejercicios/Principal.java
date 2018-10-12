package Ejercicios;

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
        Precio p; //se llama a  la clase Precio
        p = new Precio(); //variable inicializada con la clase
        p.euros = 10.1; //asignacion de valor
        System.out.println(p.euros); // presentacion de la variable con el metodo p
        
    }
    
}
