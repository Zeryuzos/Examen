/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.numerosyproductores;

/**
 *
 * @author ASUS
 */
public class Productor implements Runnable{
        Cola colaCompartida;
        public Productor(Cola cola){
                this.colaCompartida=cola;
        }

    Productor(Cola colaCompartida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public void run() {
           while (true){
                   int num=Utilidades.numAzar(10);
                   while (colaCompartida.encolar(num)==false){
                           Utilidades.esperarTiempoAzar(3000);
                   } /*Fin del while*/

                   System.out.println("Productor encoló el numero:"+num);
           } /*Fin del while externo*/
        } /*Fin de run()*/
} /*Fin de la clase*/
