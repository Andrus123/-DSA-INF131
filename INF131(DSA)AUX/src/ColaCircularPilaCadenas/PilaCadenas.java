package ColaCircularPilaCadenas;


public class PilaCadenas {
	private int tope;
	private int max=10;
	private String [] p=new String[max+1];
	public PilaCadenas() {
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
	void adicionar(String ped) {
		if(!esllena()) {
			tope++;
			p[tope]=ped;
		}
		else
			System.out.println("Pila llena");
	}
	String eliminar() {
		String elem=null;
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
			String x=new String();
			x=Leer.dato();
			adicionar(x);
		}
	}
	public void mostrar(){
		PilaCadenas aux=new PilaCadenas();
		while(!esvacia()) {
			String cad=eliminar();
			System.out.println(cad);
			aux.adicionar(cad);
		}
		vaciar(aux);
	}
	public void vaciar(PilaCadenas x) {
		while(!x.esvacia())
			adicionar(x.eliminar());
	}
}
