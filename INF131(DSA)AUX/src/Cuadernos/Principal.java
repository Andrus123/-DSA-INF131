package Cuadernos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaCuaderno pc=new PilaCuaderno();
		pc.llenar();
		pc.mostrar();
		// a. Ordenar los cuadernos ascendentemente por el nroHojas
		SolucionA(pc);
		pc.mostrar();
		// b. Contar los cuadernos con tamaño oficio
		SolucionB(pc);
		// c. Agrupar por la marca
		SolucionC(pc);
		pc.mostrar();
	}
	public static void SolucionA(PilaCuaderno a) {
		System.out.println("ORDENADO POR HOJAS");
		PilaCuaderno aux=new PilaCuaderno(), rst=new PilaCuaderno();
		while(!a.esvacia()) {
			Cuaderno may=a.eliminar();
			while(!a.esvacia()) {
				Cuaderno x=a.eliminar();
				if(x.getNroHojas()>may.getNroHojas()) {
					aux.adicionar(may);
					may=x;
				}
				else
					aux.adicionar(x);
			}
			a.vaciar(aux);
			rst.adicionar(may);
		}
		a.vaciar(rst);
	}
	
	private static void SolucionB(PilaCuaderno a) {
		// TODO Auto-generated method stub
		int c=0;
		PilaCuaderno aux=new PilaCuaderno();
		while(!a.esvacia()) {
			Cuaderno x=a.eliminar();
			if(x.getTamaño().equals("Oficio"))
				c++;
			aux.adicionar(x);
		}
		a.vaciar(aux);
		System.out.println("CUADERNOS TAMAÑO OFICIO: "+c);
	}
	private static void SolucionC(PilaCuaderno pc) {
		// TODO Auto-generated method stub
		PilaCuaderno aux=new PilaCuaderno(), rst=new PilaCuaderno();
		while(!pc.esvacia()) {
			Cuaderno x=pc.eliminar();
			rst.adicionar(x);
			while(!pc.esvacia()) {
				Cuaderno y=pc.eliminar();
				if(y.getMarca().equals(x.getMarca()))
					rst.adicionar(y);
				else
					aux.adicionar(y);
			}
			pc.vaciar(aux);
		}
		pc.vaciar(rst);
	}
}
