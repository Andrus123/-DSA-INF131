package Cuadernos;

public class PilaCuaderno{
	private int tope;
	private int max=10;
	private Cuaderno[] v=new Cuaderno[max+1];
	public PilaCuaderno() {
		// TODO Auto-generated constructor stub
		tope=0;
	}

	public boolean esvacia() {
		return tope==0;
	}
	public boolean esllena() {
		return tope==max;
	}
	public int nroelem() {
		return (tope);
	}
	public void adicionar(Cuaderno c) {
		if(!esllena()) {
			tope++;
			v[tope]=c;
		}
		else
			System.out.println("Pila llena");
	}
	public Cuaderno eliminar() {
		Cuaderno elem=null;
		if(!esvacia()) {
			elem=v[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	public void llenar() {
		adicionar(new Cuaderno("TOP",200,"Carta"));
		adicionar(new Cuaderno("FaberCastel",500,"Oficio"));
		adicionar(new Cuaderno("TOTTO",650,"Carta"));
		adicionar(new Cuaderno("Mattel",400,"Carta"));
		adicionar(new Cuaderno("TOTTO",550,"Oficio"));
		adicionar(new Cuaderno("FaberCastel",450,"Oficio"));
		adicionar(new Cuaderno("Sabonis",350,"Oficio"));
	}
	public void mostrar() {
		PilaCuaderno aux= new PilaCuaderno();
		while(!esvacia()) {
			Cuaderno num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	public void vaciar(PilaCuaderno z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
}
