package MultiplepilaCuadernos;


public class PilaCuadernos {
	private int tope;
	private int max=10;
	private Cuaderno[] c=new Cuaderno[max+1];
	public PilaCuadernos() {
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
	void adicionar(Cuaderno es) {
		if(!esllena()) {
			tope++;
			c[tope]=es;
		}
		else
			System.out.println("Pila llena");
	}
	Cuaderno eliminar() {
		Cuaderno elem=null;
		if(!esvacia()) {
			elem=c[tope];
			tope--;
		}
		else
			System.out.println("Pila llena");
		return elem;
	}
	public void llenar(int n) {
		for(int i=0; i<n; i++) {
			Cuaderno x=new Cuaderno();
			x.leer();
			adicionar(x);
		}
	}
	public void mostrar(){
		PilaCuadernos aux=new PilaCuadernos();
		while(!esvacia()) {
			Cuaderno cud=eliminar();
			cud.mostrar();
			aux.adicionar(cud);
		}
		vaciar(aux);
	}
	public void vaciar(PilaCuadernos x) {
		while(!x.esvacia())
			adicionar(x.eliminar());
	}
}
