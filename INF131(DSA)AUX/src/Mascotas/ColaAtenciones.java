package Mascotas;

public class ColaAtenciones {
	private int ini, fin, max=10;
	private Atencion[] a=new Atencion[max+1];
	ColaAtenciones() {
		ini=fin=0;
	}
	boolean esvacio() {
		return(ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(Atencion x) {
		if(!eslleno()) {
			fin++;
			a[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Atencion eliminar() {
		Atencion elem=null;
		if(!esvacio()) {
			ini++;
			elem=a[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("Cola vacia");
		return elem;
	}
	void llenar() {
		adicionar(new Atencion(2233, "3/09/2021"));
		adicionar(new Atencion(1166, "5/09/2021"));
		adicionar(new Atencion(1166, "3/09/2021"));
		adicionar(new Atencion(6633, "6/09/2021"));
		adicionar(new Atencion(5544, "7/09/2021"));
		adicionar(new Atencion(9988, "3/09/2021"));
	}
	void mostrar() {
		ColaAtenciones aux=new ColaAtenciones();
		while(!esvacio()) {
			Atencion x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(ColaAtenciones x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
