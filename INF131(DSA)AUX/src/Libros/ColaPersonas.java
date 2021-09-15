package Libros;



public class ColaPersonas {
	private int ini, fin, max=10;
	private Persona[] p=new Persona[max+1];
	ColaPersonas() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(Persona x) {
		if(!eslleno()) {
			fin++;
			p[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Persona eliminar() {
		Persona elem=null;
		if(!esvacio()) {
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
		adicionar(new Persona("Andres",25,new Libro("Eloquent Js", "Marijn", 500)));
		adicionar(new Persona("Mauren",23,new Libro("Don Quijote", "De Cervantes", 1500)));
		adicionar(new Persona("Kelly",24,new Libro("El Padrino", "Puzo", 2000)));
		adicionar(new Persona("Carlo",24,new Libro("Zero to One", "Thiel", 350)));
		adicionar(new Persona("Fabri",25,new Libro("Cryptonomicon", "Anonimos", 3000)));
	}
	void mostrar() {
		ColaPersonas aux=new ColaPersonas();
		while(!esvacio()) {
			Persona x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(ColaPersonas x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
