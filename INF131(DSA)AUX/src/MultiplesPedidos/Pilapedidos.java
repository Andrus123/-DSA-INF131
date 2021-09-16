package MultiplesPedidos;


public class Pilapedidos {
	private int tope;
	private int max=10;
	private Pedido [] p=new Pedido[max+1];
	public Pilapedidos() {
		super();
		// TODO Auto-generated constructor stub
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	int nroelem() {
		return(tope);
	}
	void adicionar(Pedido ped) {
		if(!esllena()) {
			tope++;
			p[tope]=ped;
		}
		else
			System.out.println("Pila llena");
	}
	Pedido eliminar() {
		Pedido elem=null;
		if(!esvacia()) {
			elem=p[tope];
			tope--;
		}
		else
			System.out.println("Pila llena");
		return elem;
	}
	public void llenar(int n) {
		for(int i=0; i<n; i++) {
			Pedido x=new Pedido();
			x.leer();
			adicionar(x);
		}
	}
	public void mostrar(){
		Pilapedidos aux=new Pilapedidos();
		while(!esvacia()) {
			Pedido ped=eliminar();
			ped.mostrar();
			aux.adicionar(ped);
		}
		vaciar(aux);
	}
	public void vaciar(Pilapedidos x) {
		while(!x.esvacia())
			adicionar(x.eliminar());
	}
}
