package ColaCircularPilaCadenas;


public class CCircularPilaCadenas {
	private int ini,fin, max=30;
	private PilaCadenas[] v=new PilaCadenas[max+1];
	
	CCircularPilaCadenas() {
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
	void adicionar(PilaCadenas elem) {
		if(!eslleno()) {
			fin=(fin+1)%max;
			v[fin]=elem;
		}
		else
			System.out.println("cola llena");
	}
	PilaCadenas eliminar() {
		PilaCadenas elem=null;
		if(!esvacia()) {
			ini=(ini+1)%max;
			elem=v[ini];
			if(nroelem()==0)
				ini=fin=0;
		}
		else
			System.out.println("cola vacia");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			PilaCadenas p=new PilaCadenas();
			p.llenar(n);
			adicionar(p);
		}
	}
	void llenar() {
		PilaCadenas p1=new PilaCadenas();
		PilaCadenas p2=new PilaCadenas();
		p1.adicionar("Andres");
		p1.adicionar("BTC");
		p1.adicionar("Mauren");
		p2.adicionar("Carlo");
		p2.adicionar("Nft");
		p2.adicionar("Mica");
		this.adicionar(p1);
		this.adicionar(p2);
	}
	void mostrar() {
		CCircularPilaCadenas aux=new CCircularPilaCadenas();
		for (int i=0;i<=this.nroelem();i++){
			PilaCadenas x=eliminar();
			System.out.println("Pila de Cadena: "+i);
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CCircularPilaCadenas w) {
		while(!w.esvacia())
			adicionar(w.eliminar());
	}
}
