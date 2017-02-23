package principal;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente("62277217J", "López", "Lucía", 
				"7281-1212-2332-9922");
		c.mostrar();

		Empleado e = new Empleado("61235726", "Sánchez", "Carlos", 
				"Jefe");
		e.mostrar();
	}

}
