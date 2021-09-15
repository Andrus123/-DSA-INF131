package Libros;

public class Persona {
	private String nombre;
	private int edad;
	private Libro l;
	public Persona(String nombre, int edad, Libro l) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.l = l;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Libro getL() {
		return l;
	}
	public void setL(Libro l) {
		this.l = l;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", l=" + l + "]";
	}
	public void leer() {
		nombre=Leer.dato();
		edad=Leer.datoInt();
		l.leer();
	}
	public void mostrar() {
		System.out.println(toString());
	}
	
}
