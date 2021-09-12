package Cuadernos;

public class Cuaderno {
	private String marca, tamaño;
	private int nroHojas;
	public Cuaderno() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Cuaderno(String marca, int nroHojas, String tamaño) {
		super();
		this.marca = marca;
		this.nroHojas = nroHojas;
		this.tamaño = tamaño;
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
	
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "Cuaderno [marca=" + marca + ", nroHojas=" + nroHojas + ", tamaño=" + tamaño + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	public void leer() {
		marca=Leer.dato();
		nroHojas=Leer.datoInt();
		tamaño=Leer.dato();
	}

}
