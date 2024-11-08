/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edlistacircular;

import javax.swing.JOptionPane;

/**
 *
 * @author julio.nava
 */
public class ListaCircular {
    
    public NodoLC ultimo;
    
    public ListaCircular() {
        ultimo = null;
    }
    
    //Saber cuando la lista está vacia
    public boolean estaVacia() {
        return ultimo == null;
    }
    
    //Método para insertar un Nodo
    public ListaCircular insertar(int elemento) {
        NodoLC nuevo = new NodoLC(elemento);
        if(ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        
        return this;
    }
    
    //Método para recorrer la lista
    public void mostrarLista() {
        NodoLC auxiliar = ultimo.siguiente;
        String cadena = "";
        do {
            cadena = cadena + "[" + auxiliar.dato + "]->";
            auxiliar = auxiliar.siguiente;
        }while(auxiliar !=  ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena, "Mostrando Lista Circular", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Metodo para eliminar un nodo de la lista
    public boolean eliminar(int elemento) {
        NodoLC actual;
        boolean encontrado = false;
        actual = ultimo;
        while(actual.siguiente != ultimo && !encontrado) {
            encontrado = (actual.siguiente.dato == elemento);
            if(!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = (actual.siguiente.dato == elemento);
        
        if(encontrado) {
            NodoLC auxiliar = actual.siguiente;
            if(ultimo == ultimo.siguiente) { //Ya no queda nada
                ultimo = null;
            }else{
                if(auxiliar == ultimo) {
                    ultimo = actual;     
                }
                actual.siguiente = auxiliar.siguiente;
            }
            auxiliar = null;
        }
        
        return encontrado == true;
    }
    
}
