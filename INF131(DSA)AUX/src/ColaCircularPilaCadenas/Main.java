package ColaCircularPilaCadenas;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircularPilaCadenas cpc= new CCircularPilaCadenas();
		cpc.llenar();
		cpc.mostrar();
		//Se pide eliminar las cadenas que tienen al menos una vocal
		Solucion(cpc);
		cpc.mostrar();
	}

	private static void Solucion(CCircularPilaCadenas cpc) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando Cadenas con vocales...");
		CCircularPilaCadenas aux=new CCircularPilaCadenas();
		while(!cpc.esvacia()) {
			PilaCadenas auxpc=new PilaCadenas(), rest=new PilaCadenas();
			PilaCadenas x=cpc.eliminar();
			while(!x.esvacia()) {
				String y=x.eliminar();
				if(Vocales(y)) { 
					auxpc.adicionar(y);
				}else
				rest.adicionar(y);
			}
			aux.adicionar(rest);
		}
		cpc.vaciar(aux);
	}
	private static boolean Vocales(String y) {
		String z[]=y.split("",0);
		for(int i=0; i<z.length;i++) {
			if(z[i].equals("a")
			 ||z[i].equals("A")
			 ||z[i].equals("e")
			 ||z[i].equals("E")
			 ||z[i].equals("i")
			 ||z[i].equals("I")
			 ||z[i].equals("o")
			 ||z[i].equals("O")
			 ||z[i].equals("u")
			 ||z[i].equals("U")) {
				return true;
			}
		}
		return false;
	}
}
