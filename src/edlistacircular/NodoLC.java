/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edlistacircular;

/**
 *
 * @author julio.nava
 */
public class NodoLC {
    
    public int dato;
    public NodoLC siguiente;
    
    public NodoLC(int el) {
        dato = el;
        siguiente = this;
    }
    
}
