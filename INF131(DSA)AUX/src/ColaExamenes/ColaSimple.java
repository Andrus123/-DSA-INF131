package ColaExamenes;

public class ColaSimple {
	private int ini, fin, max=10;
	private Examen[] ex=new Examen[max+1];
	ColaSimple() {
		ini=fin=0;
	}
	boolean esvacio() {
		return (ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(Examen x) {
		if(!eslleno()) {
			fin++;
			ex[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Examen eliminar() {
		Examen elem=null;
		if(!esvacio()) {
			ini++;
			elem=ex[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("Cola vacia");
		return elem;
	}
	void llenar() {
		adicionar(new Examen(89,"Andres"));
		adicionar(new Examen(76,"Mauren"));
		adicionar(new Examen(45,"Kelly"));
		adicionar(new Examen(68,"Carla"));
		adicionar(new Examen(57,"Fabri"));
		adicionar(new Examen(76,"Lore"));
	}
	void mostrar() {
		ColaSimple aux=new ColaSimple();
		while(!esvacio()) {
			Examen x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(ColaSimple x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
