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
import java.util.Scanner;

public class Arbol {

    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void armarArbol() {
        //level 1
        raiz = new Nodo("¿Qué deseas hacer primero?", "Conseguir alimento/agua", "Conseguir refugio", false, "");

        //level 2
        raiz.izquierda = new Nodo("¿Qué deseas hacer?", "Recolectar", "Cazar", false, "");
        raiz.derecha = new Nodo("¿Qué deseas hacer?", "Buscar refugio", "Crear un refugio", false, "");

        //level 3
        raiz.izquierda.izquierda = new Nodo("¿Qué deseas recolectar?", "Agua", "Frutas", false, "");
        raiz.izquierda.derecha = new Nodo("¿Cómo deseas cazar?", "Pescar", "Crear trampa", false, "");

        //level 4 - Rama izquierda
        raiz.izquierda.izquierda.izquierda = new Nodo("¿Cómo obtener agua?", "Agua de pozos", "Agua de lluvia", true, "Eliminado: agua contaminada / Victoria: agua segura");
        raiz.izquierda.izquierda.derecha = new Nodo("¿Qué frutas?", "Frutas abundantes pero desconocidas", "Frutas escasas pero conocidas", true, "Eliminado: fruta venenosa / Victoria: alimento seguro");

        //level 4 - Rama derecha
        raiz.izquierda.derecha.izquierda = new Nodo("¿Método para pescar?", "Usar red", "Usar lanza", true, "Eliminado: red rota / Victoria: comida");
        raiz.izquierda.derecha.derecha = new Nodo("¿Tipo de trampa?", "Pozo en el suelo", "Jaula de madera", true, "Victoria: atrapaste un animal / Eliminado: escapó");
    }

    public void jugar(Nodo actual, Scanner sc) {
    while (actual != null) {
        System.out.println(actual.pregunta);
        System.out.println("1. " + actual.opcion1);
        System.out.println("2. " + actual.opcion2);

        // Se asume que la entrada ya fue validada en el menú
        System.out.print("Selecciona una opcion (1 o 2): ");
        int eleccion = sc.nextInt();

        if (actual.esfinal) {
            String[] resultados = actual.resultado.split("/");
            System.out.println(eleccion == 1 ? resultados[0] : resultados[1]);
            return;
        }

        actual = (eleccion == 1) ? actual.izquierda : actual.derecha;
    }
}

}
