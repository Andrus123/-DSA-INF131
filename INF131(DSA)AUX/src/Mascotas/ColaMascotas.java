package Mascotas;

public class ColaMascotas {
	private int ini, fin, max=10;
	private Mascota[] ms=new Mascota[max+1];
	ColaMascotas() {
		ini=fin=0;
	}
	boolean esvacio() {
		return(ini==0 && fin==0);
	}
	boolean eslleno() {
		return fin==max;
	}
	void adicionar(Mascota x) {
		if(!eslleno()) {
			fin++;
			ms[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Mascota eliminar() {
		Mascota elem=null;
		if(!esvacio()) {
			ini++;
			elem=ms[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("Cola vacia");
		return elem;
	}
	void llenar() {
		adicionar(new Mascota(5544,"Cokie","M","Lobo"));
		adicionar(new Mascota(2233,"Pacheco","M","Haskie"));
		adicionar(new Mascota(1166,"Soda","H","Pequines"));
		adicionar(new Mascota(6633,"Lofi","M","Pitbull"));
		adicionar(new Mascota(9988,"Sam","H","Pitbull"));
	}
	void mostrar() {
		ColaMascotas aux=new ColaMascotas();
		while(!esvacio()) {
			Mascota x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(ColaMascotas x) {
		while(!x.esvacio())
			adicionar(x.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
