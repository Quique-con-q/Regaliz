/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package regaliz;

public class Main {

    public static void main(String[] args) {
        Regaliz unRegaliz;
        int carga;

        unRegaliz = new Regaliz(12,2,"rojo", 30);
        acciones_Regaiz(unRegaliz, 1);
        carga = unRegaliz.obtener_unidades();
        System.out.println("La máquina tiene aun  " + carga+" unidades");
    }//Creamos una funcion que genere un objeto regaliz y le de acciones
    
    //@param establecemos parametros a las acciones disponivles de regaliz
    private static void acciones_Regaiz(Regaliz unRegaliz, double peso) {
        try {
            System.out.println("A por golosinas");
            unRegaliz.comprar(15, 32);
        } catch (Exception e) {
            System.out.println("Fallo al comprar");
        }

        try {
            System.out.println("Cargando máquina");
            unRegaliz.recargar(30);
        } catch (Exception e) {
            System.out.println("Fallo al cargar la máquina");
        }
    }
    
}
