/**
 * @author tonino
 */

package auxiliar;

import java.util.Scanner;

public class Grupo {

	
	// Atributos
	
	String nivel;
	int curso;
	String clase;
	
	// Constructores
	
	public Grupo(){
		
	}
	
	public Grupo(String nivel, int curso, String clase){
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}
	
	
	// Métodos
	
	public String toString(){
		return "El nivel es " + nivel + " de " + curso + " curso " + " de la clase " + clase;
	}
	
	public void leeDatos(){
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Nivel?");
		nivel = entrada.nextLine();
		
		System.out.println("¿Curso?");
		curso = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("¿Clase?");
		clase = entrada.nextLine();
	}
	
}