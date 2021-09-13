package Estudiantes;

public class PilaEvaluacion {
	private int tope;
	private int max=10;
	private Evaluacion[] evl=new Evaluacion[max+1];
	public PilaEvaluacion() {
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
	void adicionar(Evaluacion ev) {
		if(!esllena()) {
			tope++;
			evl[tope]=ev;
		}
		else
			System.out.println("Pila llena");
	}
	Evaluacion eliminar() {
		Evaluacion elem=null;
		if(!esvacia()) {
			elem=evl[tope];
			tope--;
		}
		else
			System.out.println("Pila llena");
		return elem;
	}
	public void llenar() {
		adicionar(new Evaluacion(34,3399,70));
		adicionar(new Evaluacion(23,2288,89));
		adicionar(new Evaluacion(12,1001,45));
		adicionar(new Evaluacion(54,1001,56));
		adicionar(new Evaluacion(25,5522,77));
		adicionar(new Evaluacion(64,9944,89));

	}
	public void mostrar(){
		PilaEvaluacion aux=new PilaEvaluacion();
		while(!esvacia()) {
			Evaluacion est=eliminar();
			est.mostrar();
			aux.adicionar(est);
		}
		vaciar(aux);
	}
	public void vaciar(PilaEvaluacion x) {
		while(!x.esvacia())
			adicionar(x.eliminar());
	}
}
