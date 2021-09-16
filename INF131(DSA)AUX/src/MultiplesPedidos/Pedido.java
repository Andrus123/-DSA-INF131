package MultiplesPedidos;

public class Pedido {
	private int nro_combo;
	private int cantidadsolicitada;
	public Pedido(int nro_combo, int cantidadsolicitada) {
		super();
		this.nro_combo = nro_combo;
		this.cantidadsolicitada = cantidadsolicitada;
	}
	public Pedido() {
		super();
	}
	public int getNro_combo() {
		return nro_combo;
	}
	public void setNro_combo(int nro_combo) {
		this.nro_combo = nro_combo;
	}
	public int getCantidadsolicitada() {
		return cantidadsolicitada;
	}
	public void setCantidadsolicitada(int cantidadsolicitada) {
		this.cantidadsolicitada = cantidadsolicitada;
	}
	@Override
	public String toString() {
		return "Pedido [nro_combo=" + nro_combo + ", cantidadsolicitada=" + cantidadsolicitada + "]";
	}
	public void leer() {
		nro_combo=Leer.datoInt();
		cantidadsolicitada=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
