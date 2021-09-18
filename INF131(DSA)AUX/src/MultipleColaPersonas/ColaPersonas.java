package MultipleColaPersonas;


public class ColaPersonas {
	private int ini, fin, max=10;
	private Persona[] p=new Persona[max+1];
	ColaPersonas() {
		ini=fin=0;
	}
	boolean esvacia() {
		return(ini==0 && fin==0);
	}
	boolean esllena() {
		return fin==max;
	}
	void adicionar(Persona x) {
		if(!esllena()) {
			fin++;
			p[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Persona eliminar() {
		Persona elem=null;
		if(!esvacia()) {
			ini++;
			elem=p[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("Cola vacia");
		return elem;
	}
	void llenar() {
		
	}
	void mostrar() {
		ColaPersonas aux=new ColaPersonas();
		while(!esvacia()) {
			Persona x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(ColaPersonas x) {
		while(!x.esvacia())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
