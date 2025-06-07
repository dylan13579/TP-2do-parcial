/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg2do.parcial;

import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class Menu {
 
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Arbol juego = new Arbol();
        juego.armarArbol();

        int opcion = 0;
        do {
            System.out.println("BIENVIENDO JUGADOR A ESTE JUEGO DE SUPERVIVENCIA");
            System.out.println("");
            System.out.println("----------INTRODUCCION----------");
            System.out.println("Cada elección que hagas determinará tu destino.");
            System.out.println("En este juego de supervivencia, deberás enfrentar desafíos impredecibles, pensar rápido y decidir con valentía.");
            System.out.println("Solo quienes se adapten y tomen las decisiones correctas lograrán sobrevivir.");
            System.out.println("");
            System.out.println("¿Aceptas el reto? Demuestra tu habilidad para elegir y sigue adelante, porque cada decisión cuenta.");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");


            boolean entradaValida = false;
            while (!entradaValida) {
                System.out.print("Selecciona una opcion: ");
                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    if (opcion == 1 || opcion == 2) {
                        entradaValida = true;
                    } else {
                       System.out.println("Opcion no válida. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("Entrada invalida. Debes ingresar un número.");
                    sc.next();
                }
            }

            switch (opcion) {
                case 1:
                    juego.jugar(juego.raiz, sc);
                    break;
                case 2:
                    System.out.println("¡Gracias por jugar!");
                    break;
            }
        } while (opcion != 2);
    }
}

    

   
