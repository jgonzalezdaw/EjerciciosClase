package principal;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setDni("62277217J");
		c.setApellidos("López");
		c.setNombre("Lucía");
		c.setVisa("7281-1212-2332-9922");
		c.mostrar();
		
		Empleado e = new Empleado();
		e.setDni("61235726");
		e.setApellidos("Sánchez");
		e.setNombre("Carlos");
		e.setRango("Jefe");
		e.mostrar();
	}

}
