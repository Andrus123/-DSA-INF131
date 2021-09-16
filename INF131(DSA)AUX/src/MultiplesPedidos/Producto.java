package MultiplesPedidos;

public class Producto {
	private String nombreProducto;
	private double precio;
	public Producto(String nombreProducto, double precio) {
		super();
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}
	public Producto() {
		super();
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", precio=" + precio + "]";
	}
	
	public void leer() {
		nombreProducto=Leer.dato();
		precio=Leer.datoDouble();
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
