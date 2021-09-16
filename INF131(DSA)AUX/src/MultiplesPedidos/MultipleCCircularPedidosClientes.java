package MultiplesPedidos;



public class MultipleCCircularPedidosClientes {
	private int n;
	private CCircularPedidosClientes[] v=new CCircularPedidosClientes[10];
	public MultipleCCircularPedidosClientes() {
		n=0;
		for (int i = 1; i < 10; i++) {
			v[i]=new CCircularPedidosClientes();
		}
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	boolean esvacia (int i){
    	return v[i].esvacia();
    }
    boolean esllena (int i){
    	return v[i].eslleno();
    }
    void adicionar (int i, ClientePedido elem){
		v[i].adicionar(elem);
    }
    ClientePedido eliminar (int i){
    	return v[i].eliminar();
    }
    void llenar (int n){
		this.n = n;
		for (int i = 0; i < n; i++) {
			llenar(i, Leer.datoInt());
		}
    }
    void llenar (int j, int n){
		for (int i = 0; i < n; i++) {
			ClientePedido x=new ClientePedido();
			x.leer();
			v[j].adicionar(x);
		}
    }
    void mostrar (){
    	System.out.println("\nMutiple Cola Circular Pedidos de Clientes:");
		for (int i = 1; i <= getN(); i++) {
			System.out.println("CCircularPedidosClientes "+i);
			v[i].mostrar();
		}
	}
	int nroElem (int i){
		return v[i].nroelem ();
    }
	public void mostrar(int i) {
		v[i].mostrar();
	}
	public void vaciar(int i, CCircularPedidosClientes aux) {
		v[i].vaciar(aux);
	}
	public void vaciar(int i, int j) {
		v[i].vaciar(v[j]);
	}
	public void llenar() {
		Pilapedidos pp1=new Pilapedidos();
		pp1.adicionar(new Pedido(7, 2));
		pp1.adicionar(new Pedido(2, 1));
		v[1].adicionar(new ClientePedido("Andres", "15/09/2021", pp1));
		v[1].adicionar(new ClientePedido("Kelly", "14/09/2021", pp1));
		v[1].adicionar(new ClientePedido("Mauren", "13/09/2021", pp1));
		v[1].adicionar(new ClientePedido("Fabri", "12/09/2021", pp1));
		Pilapedidos pp2=new Pilapedidos();
		pp2.adicionar(new Pedido(3, 1));
		v[2].adicionar(new ClientePedido("Maria", "12/09/2021", pp2));
		v[2].adicionar(new ClientePedido("Carla", "15/09/2021", pp2));
		v[2].adicionar(new ClientePedido("Lore", "11/09/2021", pp2));
		v[2].adicionar(new ClientePedido("Carlos", "10/09/2021", pp2));
		this.n=2;
	}
}
