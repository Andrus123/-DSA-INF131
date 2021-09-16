package MultiplepilaCuadernos;

public class MultipilaCuadernos {
	private int n;
	private PilaCuadernos[] v=new PilaCuadernos[10];
	
	public MultipilaCuadernos() {
		n=0;
		for(int i=1; i<10;i++) {
			v[i]=new PilaCuadernos();
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
	void adicionar(int i, Cuaderno elem) {
		v[i].adicionar(elem);
	}
	Cuaderno eliminar(int i) {
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
			Cuaderno x=new Cuaderno();
			x.leer();
			v[j].adicionar(x);
		}
	}
	void mostrar() {
		System.out.println("\nMultiple Pila Cuadernos:");
		for(int i=1; i<= getN(); i++) {
			System.out.println("PilaCuadernos "+i);
			v[i].mostrar();
		}
	}
	int nroElem (int i) {
		return v[i].nroelem();
	}
	public void mostrar(int i) {
		v[i].mostrar();
	}
	public void vaciar(int i, PilaCuadernos aux) {
		v[i].vaciar(aux);
	}
	public void vaciar(int i, int j) {
		v[i].vaciar(v[j]);
	}
	public void llenar() {
		this.n=3;
		v[1].adicionar(new Cuaderno("Top", 250));
		v[1].adicionar(new Cuaderno("Faber", 350));
		v[1].adicionar(new Cuaderno("Mattel", 450));
		v[2].adicionar(new Cuaderno("Mattel", 350));
		v[2].adicionar(new Cuaderno("Top", 350));
		v[2].adicionar(new Cuaderno("Top", 350));
		v[3].adicionar(new Cuaderno("Faber", 550));
		v[3].adicionar(new Cuaderno("Mattel", 550));
		v[3].adicionar(new Cuaderno("Faber", 550));
	}
}
