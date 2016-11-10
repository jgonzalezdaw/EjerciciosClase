package buclesfor;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		final int SECRETO = 6;
		
		// Preguntamos 10 veces el número secreto.
		for(int i=1;i<=10;i++){
			System.out.print("Número secreto? ");
			numero = entrada.nextInt();
			
			if(numero == SECRETO){
				break;
			}
		}
		
		// Comprobamos si el usuario ha acertado o ha gastado
		// todos los intentos.
		if(numero == SECRETO){
			System.out.println("Felicidades");
		} else{
			System.out.println("Has perdido");
		}

	}

}





