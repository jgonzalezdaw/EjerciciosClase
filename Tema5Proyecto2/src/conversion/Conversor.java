package conversion;

public class Conversor {

	static final double KM_A_MILLAS = 0.621371;
	static final double MB_A_ATM = 0.000987;
	static final double CAL_A_JULIOS = 4.1868;
	static double km;
	static double milibares;;
	static double calorias;

	public Conversor() {
		System.out.println("Se ha llamado al metodo constructor vacio");

	}

	public void setMi(double km) {

		this.km = km;
	}

	public void setAt(double milibares) {

		this.milibares = milibares;
	}

	public void setJu(double calorias) {

		this.calorias = calorias;
	}

	public double getkm() {
		return km * KM_A_MILLAS;

	}

	public double getMi() {
		return milibares * MB_A_ATM;

	}

	public double getCa() {
		return calorias * CAL_A_JULIOS;

	}
}
