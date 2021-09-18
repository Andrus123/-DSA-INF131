package MultipleColaPersonas;

public class MultipleColaPersonas {
	private int n;
	private ColaPersonas[] v=new ColaPersonas[10];
	
	public MultipleColaPersonas() {
		n=0;
		for(int i=1; i<10;i++) {
			v[i]=new ColaPersonas();
		}
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n=n;
	}
	boolean esvacia (int i){
		return v[i].esvacia();
	}
	boolean esllena(int i) {
		return v[i].esllena();
	}
	void adicionar(int i, Persona elem) {
		v[i].adicionar(elem);
	}
	Persona eliminar(int i) {
		return v[i].eliminar();
	}
	void llenar(int n) {
		this.n=n;
		for(int i=0; i<n; i++) {
			llenar(i, Leer.datoInt());
		}
	}
	void llenar(int j, int n) {
		for (int i=0; i<n; i++) {
			Persona x=new Persona();
			x.leer();
			v[j].adicionar(x);
		}
	}
	void mostrar() {
		System.out.println("\nMultiple Cola Personas:");
		for(int i=1; i<= getN(); i++) {
			System.out.println("ColaPersonas "+i);
			v[i].mostrar();
		}
	}
	int nroElem (int i) {
		return v[i].nroElem();
	}
	public void mostrar(int i) {
		v[i].mostrar();
	}
	public void vaciar(int i, ColaPersonas aux) {
		v[i].vaciar(aux);
	}
	public void vaciar(int i, int j) {
		v[i].vaciar(v[j]);
	}
	public void llenar() {
		v[1].adicionar(new Persona("Alan","Masculino",1122,28));
		v[1].adicionar(new Persona("Kelly","Femenino",3355,24));
		v[2].adicionar(new Persona("Carlos","Masculino",8899,23));
		v[2].adicionar(new Persona("Susan","Femenino",2244,35));
		v[3].adicionar(new Persona("Mauren","Femenino",9988,23));
		v[3].adicionar(new Persona("Andres","Masculino",7795,25));
		v[3].adicionar(new Persona("Carla","Femenino",1100,24));
		this.n=3;
	}
}
