

package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {
		
//		Alumno a = new Alumno();
//		a.leeDatos();
		
		Grupo g1 = new Grupo("ESO",4,"A");
		
		Alumno a1 = new Alumno(1,"Fernandez","Tonino",g1);
		Alumno a2 = new Alumno(2,"Gallego","Eneko",g1);
		Alumno a3 = new Alumno(3,"Gallego","Melania",g1);
		
		Instituto i1 = new Instituto();
		
		i1.addAlumno(a1);
		i1.addAlumno(a2);
		i1.addAlumno(a3);
		
		i1.muestraAlumnos(); 
		
		System.out.println("Número de alumnos: " + i1.numAlumnos());
		
		i1.delAlumno(3);
		
		i1.muestraAlumnos();
		
		System.out.println("Pos: " + i1.buscaAlumno(3));
		
	}
	
}















