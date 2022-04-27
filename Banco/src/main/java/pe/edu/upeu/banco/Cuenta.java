/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.banco;

/**
 *
 * @author ASUS
 */
public class Cuenta {

    private int saldo;
    private final int saldoInicial;

    public Cuenta(int saldo){
        this.saldoInicial=saldo;
        this.saldo=saldo;
    }
    public synchronized void hacerMovimiento(int cantidad){
        this.saldo = this.saldo+cantidad;
    }
    public boolean esSimulacionCorrecta(){
        return this.saldo==this.saldoInicial;
    }
    public int getSaldo(){
        return this.saldo;
    }
}