/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

/**
 *
 * @author ALIS
 */
public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario; //variable tipo Cliente
   
    //CONSTRUCTOR

    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
    
    //Metodos
    
   public void depositar(double monto) {
       //Aumenta el salod su el monto es positivo  
   }
   
   public void retirar(double monto) {
   
   }
   
   public void consultarSaldo() {
   
   
   }
    
}
