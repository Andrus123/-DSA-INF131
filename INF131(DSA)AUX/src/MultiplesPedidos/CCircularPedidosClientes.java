package MultiplesPedidos;

public class CCircularPedidosClientes {
	private int ini,fin, max=30;
	private ClientePedido[] v=new ClientePedido[max+1];
	
	CCircularPedidosClientes() {
		ini=fin=0;
	}
	
	int nroelem() {
		return (max+fin-ini)%max;
	}
	boolean esvacia() {
		return nroelem()==0;
	}
	boolean eslleno() {
		return (max-1)==nroelem();
	}
	void adicionar(ClientePedido cp1) {
		if(!eslleno()) {
			fin=(fin+1)%max;
			v[fin]=cp1;
		}
		else
			System.out.println("cola llena");
	}
	ClientePedido eliminar() {
		ClientePedido elem=null;
		if(!esvacia()) {
			ini=(ini+1)%max;
			elem=v[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("cola vacia");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			ClientePedido p=new ClientePedido();
			p.leer();
			adicionar(p);
		}
	}
	void mostrar() {
		CCircularPedidosClientes aux=new CCircularPedidosClientes();
		while(!esvacia()) {
			ClientePedido x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CCircularPedidosClientes w) {
		while(!w.esvacia())
			adicionar(w.eliminar());
	}
}
