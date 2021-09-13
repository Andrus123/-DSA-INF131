package Mascotas;

public class Atencion {
	private int idMascota;
	private String fecha;
	public Atencion(int idMascota, String fecha) {
		super();
		this.idMascota = idMascota;
		this.fecha = fecha;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Atencion [idMascota=" + idMascota + ", fecha=" + fecha + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	public void leer() {
		idMascota=Leer.datoInt();
		fecha=Leer.dato();
	}
}
