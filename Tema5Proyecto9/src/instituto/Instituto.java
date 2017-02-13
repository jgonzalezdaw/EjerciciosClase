package instituto;

import auxiliar.Alumno;

public class Instituto {
	/**
	 * @author tonino
	 */
	// Atributos
	
	private final int MAX_ALUMNOS = 10;
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];	
	// Constructores
	
	
	
	// Método
	public void addAlumno(Alumno alu) {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}
			
		}
		
	}
	
	public void delAlumno(int numExp) {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i].getNumExpediente() == numExp ) {
				alumnos[i] = null;
				break;
			}
			
		}
		
	}
	
	public void muestraAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i]);
			}
		}
		 
	}
	
	public int numAlumnos() {
		int suma = 0;
		
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				suma += 1;
			}
		}
		return suma;
		
	}
	
//	public int buscaAlumno(int numExp) {
//		
//	        
//	        for (int i = 0; i < alumnos.length; i++) {
//	            if (alumnos[i].getNumExpediente() == numExp) {
//	                return i;
//	            } else {
//	                return -1;
//	            }
//	        }
//	        
//		
//		
//	}
	
	
	
	
}