package Mascotas;

public class Mascota {
	private int idMascota;
	private String nombre,sexo,tipo;
	public Mascota(int idMascota, String nombre, String sexo, String tipo) {
		super();
		this.idMascota = idMascota;
		this.nombre = nombre;
		this.sexo = sexo;
		this.tipo = tipo;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", sexo=" + sexo + ", tipo=" + tipo + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	public void leer() {
		idMascota=Leer.datoInt();
		nombre=Leer.dato();
		sexo=Leer.dato();
		tipo=Leer.dato();
	}
}
