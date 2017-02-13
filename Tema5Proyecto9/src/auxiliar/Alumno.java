/**
 * @author tonino
 */

package auxiliar;

import java.util.Scanner;

public class Alumno {

	// Atributos
	
	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;
	
	// Constructores
	
	public Alumno(){
		
	}
	
	public Alumno (int numExpediente, String apellidos, String nombre, Grupo grupo){
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	
	//Métodos
	
	public String toString(){
		return "El número de expediente es: " + numExpediente + "\nApellidos: " + apellidos + "\nNombre: " + nombre + "\nGrupo" + grupo;
	}
	
	public void leeDatos(){
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Número de expediente?");
		numExpediente = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("¿Apellidos?");
		apellidos = entrada.nextLine();
		
		System.out.println("¿Nombre?");
		nombre = entrada.nextLine();
		
		
		System.out.println("¿Grupo?");
		entrada.nextLine();

		Grupo g1 = new Grupo();
		g1.leeDatos();
	}

	// Metodos de acceso
	
	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}
	
	
}