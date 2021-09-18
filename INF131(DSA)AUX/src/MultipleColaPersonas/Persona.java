package MultipleColaPersonas;

public class Persona {
	private String nombre, sexo;
	private int ci, edad;
	public Persona(String nombre, String sexo, int ci, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.ci = ci;
		this.edad = edad;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", ci=" + ci + ", edad=" + edad + "]";
	}
	public void leer() {
		nombre=Leer.dato();
		ci=Leer.datoInt();
		edad=Leer.datoInt();
		sexo=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
