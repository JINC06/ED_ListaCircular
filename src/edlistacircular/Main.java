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
public class Main {
    
    public static void main(String[] args) {
        ListaCircular listaCircular = new ListaCircular();
        int opcion = 0, elemento;
        
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1. Agregar un Nodo a la Lista Circular\n" + 
                        "2. Eliminar un Nodo de la Lista Circular\n" +
                        "3. Mostrar los datos de la Lista Circular\n" + 
                        "4. Salir\n" + 
                        "¿Que deseas hacer?", "Menú de opciones", JOptionPane.INFORMATION_MESSAGE));
                
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del Nodo", 
                                "Agregando Nodo a la Lista Circular", JOptionPane.INFORMATION_MESSAGE));
                        listaCircular.insertar(elemento);
                        break;
                    case 2:
                        if(!listaCircular.estaVacia()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del Nodo a Eliminar", 
                                    "Eliminando Nodo de la Lista Circular", JOptionPane.INFORMATION_MESSAGE));
                            if(listaCircular.eliminar(elemento)) {
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento, "Eliminando Nodos", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "El elemento: " + elemento + " no está en la lista", "Elemento No Encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aún", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!listaCircular.estaVacia()) {
                            listaCircular.mostrarLista();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aún", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;   
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción no está en el menú", "Error", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                
            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
            }
        }while(opcion != 4);
        
    }
    
}
