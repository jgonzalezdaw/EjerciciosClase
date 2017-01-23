package cuentabancaria;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria miCuenta = new CuentaBancaria(200);

		System.out.println("Has creado una cuenta con " + 
				miCuenta.saldo + " euros.");
		
		System.out.println("Retirando 30 euros...");
		boolean resultado = miCuenta.retirar(30);
		if(resultado){
			System.out.println("Ok.");
		}else{
			System.out.println("Error: no hay suficientes "
					+ "fondos.");
		}
		
		System.out.println("\nAñadiendo 100 euros...");
			miCuenta.depositar(100);
		System.out.println("El saldo es " + 
				miCuenta.obtenerSaldo());
		
	}

}









