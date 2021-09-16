package MultiplesPedidos;


public class CCircularCombos {
	private int ini,fin, max=30;
	private Combo[] v=new Combo[max+1];
	
	CCircularCombos() {
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
	void adicionar(Combo elem) {
		if(!eslleno()) {
			fin=(fin+1)%max;
			v[fin]=elem;
		}
		else
			System.out.println("cola llena");
	}
	Combo eliminar() {
		Combo elem=null;
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
			Combo p=new Combo();
			p.leer();
			adicionar(p);
		}
	}
	void llenar() {
		ColaSimpleProductos cprod1=new ColaSimpleProductos();
		cprod1.adicionar(new Producto("Texana", 25.00));
		cprod1.adicionar(new Producto("Hawaiana", 25.00));
		cprod1.adicionar(new Producto("Barbeque", 25.00));
		cprod1.adicionar(new Producto("Clasica", 25.00));
		adicionar(new Combo(2, "12 Pack de Hamburguesas", 220.50, cprod1));
		ColaSimpleProductos cprod2=new ColaSimpleProductos();
		cprod2.adicionar(new Producto("Pizza Carnivora", 50));
		cprod2.adicionar(new Producto("Pizza Vegetariana", 50));
		cprod2.adicionar(new Producto("Pizza Italiana", 50));
		adicionar(new Combo(7,"3 Pizzas tamaño Familiar",150.50,cprod2));
		ColaSimpleProductos cprod3=new ColaSimpleProductos();
		cprod3.adicionar(new Producto("Tacos", 20.10));
		cprod3.adicionar(new Producto("Burrito", 25.10));
		cprod3.adicionar(new Producto("Virria", 22.10));
		adicionar(new Combo(3,"3 Comidas Mexicanas",80,cprod3));
	}
	void mostrar() {
		CCircularCombos aux=new CCircularCombos();
		while(!esvacia()) {
			Combo x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CCircularCombos w) {
		while(!w.esvacia())
			adicionar(w.eliminar());
	}
}
