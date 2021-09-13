package Estudiantes;

public class PilaEstudiante {
	private int tope;
	private int max=10;
	private Estudiante[] e=new Estudiante[max+1];
	public PilaEstudiante() {
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
	void adicionar(Estudiante es) {
		if(!esllena()) {
			tope++;
			e[tope]=es;
		}
		else
			System.out.println("Pila llena");
	}
	Estudiante eliminar() {
		Estudiante elem=null;
		if(!esvacia()) {
			elem=e[tope];
			tope--;
		}
		else
			System.out.println("Pila llena");
		return elem;
	}
	public void llenar() {
		adicionar(new Estudiante("Mauren","Quiroga","Gutierre",2288));
		adicionar(new Estudiante("Kelly","Valdivia","Lopez",3399));
		adicionar(new Estudiante("Andres","Aquin","Flores",1001));
		adicionar(new Estudiante("Carlos","Flores","Choque",5522));
		adicionar(new Estudiante("Carla","Arteaga","Lopez",9944));
	}
	public void mostrar(){
		PilaEstudiante aux=new PilaEstudiante();
		while(!esvacia()) {
			Estudiante est=eliminar();
			est.mostrar();
			aux.adicionar(est);
		}
		vaciar(aux);
	}
	public void vaciar(PilaEstudiante x) {
		while(!x.esvacia())
			adicionar(x.eliminar());
	}
}
