package MultiplepilaCuadernos;

public class Cuaderno {
	private String marca;
	private int nroHojas;
	public Cuaderno(String marca, int nroHojas) {
		super();
		this.marca = marca;
		this.nroHojas = nroHojas;
	}
	
	public Cuaderno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNroHojas() {
		return nroHojas;
	}
	public void setNroHojas(int nroHojas) {
		this.nroHojas = nroHojas;
	}
	@Override
	public String toString() {
		return "Cuaderno [marca=" + marca + ", nroHojas=" + nroHojas + "]";
	}
	public void leer() {
		marca=Leer.dato();
		nroHojas=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
