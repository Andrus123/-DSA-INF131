package Cuadernos;

public class Cuaderno {
	private String marca, tama�o;
	private int nroHojas;
	public Cuaderno() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Cuaderno(String marca, int nroHojas, String tama�o) {
		super();
		this.marca = marca;
		this.nroHojas = nroHojas;
		this.tama�o = tama�o;
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
	
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	@Override
	public String toString() {
		return "Cuaderno [marca=" + marca + ", nroHojas=" + nroHojas + ", tama�o=" + tama�o + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	public void leer() {
		marca=Leer.dato();
		nroHojas=Leer.datoInt();
		tama�o=Leer.dato();
	}

}
