package cuentabancaria;

public class CuentaBancaria {
    
    // Atributos
	
    int saldo;    
    
    // Métodos
    
    CuentaBancaria(int saldo){
        this.saldo = saldo;
    }
    
    void depositar(int cantidad){
        saldo = saldo + cantidad;
    }
    
    boolean retirar(int cantidad){
        if (cantidad <= saldo){
            saldo = saldo - cantidad;
            return true;
        }else {
            return false;
        }
    }
    
    int obtenerSaldo(){
        return saldo;
    }

}






