/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg2do.parcial;

/**
 *
 * @author dylan
 */
public class Nodo {
   
    public String pregunta;
    public String opcion1;
    public String opcion2;
    public Nodo izquierda;
    public Nodo derecha;
    public boolean esfinal;
    public String resultado;

    public Nodo(String pregunta, String opcion1, String opcion2, boolean esFinal, String resultado) {
        this.pregunta = pregunta;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.esfinal = esFinal;
        this.resultado = resultado;
        this.izquierda = null;
        this.derecha = null;
    }

}