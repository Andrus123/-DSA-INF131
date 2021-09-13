package ColaExamenes;

public class Examen {
	private int nota;
	private String nombre;
	public Examen(int nota, String nombre) {
		super();
		this.nota = nota;
		this.nombre = nombre;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Examen [nota=" + nota + ", nombre=" + nombre + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	public void leer() {
		nota=Leer.datoInt();
		nombre=Leer.dato();
	}
}
