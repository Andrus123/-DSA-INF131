package MultiplepilaCuadernos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipilaCuadernos m1=new MultipilaCuadernos();
		m1.llenar();
		m1.mostrar();
		//Ordenar por marcas
		Ordenar(m1);
		m1.mostrar();
	}

	private static void Ordenar(MultipilaCuadernos m1) {
		// TODO Auto-generated method stub
		PilaCuadernos aux=new PilaCuadernos();
		for(int i=1; i<=m1.getN();i++) {
			while(!m1.esvacia(i)) {
				Cuaderno x=m1.eliminar(i);
				AgruparCuadernos(i,x.getMarca(),m1);
				aux.adicionar(x);
			}
			m1.vaciar(i, aux);
		}
	}

	private static void AgruparCuadernos(int i, String marca, MultipilaCuadernos m1) {
		// TODO Auto-generated method stub
		PilaCuadernos aux=new PilaCuadernos(),rest=new PilaCuadernos();;
		for(int j=1;j<=m1.getN();j++) {
			while(!m1.esvacia(j)) {
				Cuaderno x=m1.eliminar(j);
				if(x.getMarca().equals(marca))
					aux.adicionar(x);
				else
					rest.adicionar(x);
			}
			m1.vaciar(i, rest);
			m1.vaciar(j, aux);
		}
	}

}
