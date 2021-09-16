package MultiplesPedidos;


public class ColaSimpleProductos {
	private int ini, fin, max=30;
	private Producto[] v=new Producto[max+1];
	ColaSimpleProductos() {
		ini=fin=0;
	}
	boolean esvacia() {
		return (ini==0 && fin==0);
	}
	boolean esllena() {
		return fin==max;
	}
	void adicionar(Producto x) {
		if(!esllena()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Producto eliminar() {
		Producto elem=null;
		if(!esvacia()) {
			ini++;
			elem=v[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("Cola llena");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			Producto x=new Producto();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		ColaSimpleProductos aux=new ColaSimpleProductos();
		while(!esvacia()) {
			Producto x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(ColaSimpleProductos z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
	public void llenar() {

	}
}
