package MultiplesPedidos;

public class Combo {
	private int nro_combo;
	private String descripcion;
	private double precio;
	private ColaSimpleProductos p;
	public Combo(int nro_combo, String descripcion, double precio, ColaSimpleProductos p) {
		super();
		this.nro_combo = nro_combo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.p = p;
	}
	public Combo() {
		super();
	}
	public int getNro_combo() {
		return nro_combo;
	}
	public void setNro_combo(int nro_combo) {
		this.nro_combo = nro_combo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public ColaSimpleProductos getP() {
		return p;
	}
	public void setP(ColaSimpleProductos p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Combo [nro_combo=" + nro_combo + ", descripcion=" + descripcion + ", precio=" + precio+ "]";
	}
	public void leer() {
		nro_combo=Leer.datoInt();
		descripcion=Leer.dato();
		precio=Leer.datoDouble();
		p.llenar();
	}
	public void mostrar() {
		System.out.println(toString());
		p.mostrar();
	}
}
