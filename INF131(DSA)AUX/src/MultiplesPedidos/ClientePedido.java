package MultiplesPedidos;

public class ClientePedido {
	private String nomCliente;
	private String fecha;
	private Pilapedidos pd;
	public ClientePedido(String nomCliente, String fecha, Pilapedidos pd) {
		super();
		this.nomCliente = nomCliente;
		this.fecha = fecha;
		this.pd = pd;
	}
	public ClientePedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Pilapedidos getPd() {
		return pd;
	}
	public void setPd(Pilapedidos pd) {
		this.pd = pd;
	}
	@Override
	public String toString() {
		return "ClientePedido [nomCliente=" + nomCliente + ", fecha=" + fecha + "]";
	}
	public void leer() {
		nomCliente=Leer.dato();
		fecha=Leer.dato();
		pd.llenar(Leer.datoInt());
	}
	public void mostrar() {
		System.out.println(toString());
		pd.mostrar();
	}
}
