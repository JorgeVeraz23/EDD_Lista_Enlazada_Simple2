/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaenlazada2;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class EDDListaEnlazada {

    public static void main(String[] args) {
        Lista listita = new Lista();
        int opcion = 0, el;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un elemento al inicio de la lista \n2.Agregar un elemento al final de la lista\n"
                        + "3. Mostrar los datos de la lista\n"
                        +"4 Salir"));
                switch(opcion){
                    case 1:
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ", "Insertando al inicio",3));
                            listita.agregarAlInicio(el);
                            //Agregando al Nodo
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
                        }
                        break;
                    case 2:
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ", "final",3));
                            listita.agregarAlFinal(el);
                            //Agregando al Nodo
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
                        }
                        break;
                    case 3:
                        listita.mostrarLista();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
            }
        }while(opcion!=4);
    }
}
