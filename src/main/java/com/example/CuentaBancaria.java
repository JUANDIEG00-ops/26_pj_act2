package com.example;

public class CuentaBancaria {
    private String titular;
    private double saldo;


    public CuentaBancaria(String titular, double saldoinicial){
        this.titular = titular;
        if (saldoinicial < 0){
            this.saldo = 0;} 
            else {
                this.saldo = saldoinicial;
            }
        }

        public String getTitular(){
            return titular;
        }
        
        public void setTitular(String titular){
            this.titular = titular;
        }

        public double getSaldo(){
            return saldo;
        }

        public void depositar(double cantidad){
            if (cantidad > 0){
                this.saldo += cantidad;
            }
        }

        public void retirar(double cantidad){
            if (cantidad > 0 && this.saldo > cantidad){
                this.saldo -= cantidad;
            }else {
                System.out.println("Fondos Insuficientes");
            }
        }

    }

