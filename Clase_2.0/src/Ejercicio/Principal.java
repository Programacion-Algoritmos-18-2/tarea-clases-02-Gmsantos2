package Ejercicio;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo e = new Equipo(); //Asigno a una variable la clase Equipo
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e.obtener_nombre(), e.obtener_njugadores(), e.obtener_ciudad()); //presentar
        Equipo e2 = new Equipo("Liga de Loja"); //Asigno a una variable la clase Equipo y agrego a nombre un valor string
        e2.agregar_numjugadores(20);
        e2.agregar_ciudad("Loja");
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e2.obtener_nombre(), e2.obtener_njugadores(), e2.obtener_ciudad());//salida
        Equipo e3 = new Equipo("Nacional");//Asigno a una variable la clase Equipo y agrego a nombre un valor string
        e3.agregar_numjugadores(25);
        e3.agregar_ciudad("Quito");
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e3.obtener_nombre(), e3.obtener_njugadores(), e3.obtener_ciudad());//salida
        Equipo e4 = new Equipo("Real Madrid");//Asigno a una variable la clase Equipo y agrego a nombre un valor string
        e4.agregar_numjugadores(27);
        e4.agregar_ciudad("Madrid");
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e4.obtener_nombre(), e4.obtener_njugadores(), e4.obtener_ciudad());//salida
    }
    
}
