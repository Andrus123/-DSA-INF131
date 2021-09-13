package Mascotas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaMascotas m1 = new ColaMascotas();
		m1.llenar();
		m1.mostrar();
		ColaAtenciones a1= new ColaAtenciones();
		a1.llenar();
		a1.mostrar();
		//a Mostrar el nombre de las mascotas que fueron atendidas
		// en la clinica veterinaria en la fecha X
		MostrarMascotaenFecha(a1,m1,"3/09/2021");
		//b Mostrar las mascotas que fue atendida más veces en la clinica veterinaria
		MascotaMasAtendida(a1,m1);
	}
	private static void MostrarMascotaenFecha(ColaAtenciones a1,ColaMascotas m1,String fecha) {
		// TODO Auto-generated method stub
		System.out.println("Mascotas atendidas en fecha: "+fecha);
		ColaAtenciones aux=new ColaAtenciones();
		while(!a1.esvacio()) {
			Atencion x=a1.eliminar();
			if(x.getFecha().equals(fecha))
				EncontrarMascota(x,m1);
				aux.adicionar(x);
		}
		a1.vaciar(aux);
	}
	private static void EncontrarMascota(Atencion a1, ColaMascotas m1) {
		ColaMascotas aux=new ColaMascotas();
		while(!m1.esvacio()) {
			Mascota x=m1.eliminar();
			if(a1.getIdMascota()==x.getIdMascota()) 
				x.mostrar();
				aux.adicionar(x);
		}
		m1.vaciar(aux);
	}
	private static void MascotaMasAtendida(ColaAtenciones a1, ColaMascotas m1) {
		// TODO Auto-generated method stub
		ColaAtenciones auxt=new ColaAtenciones(), res=new ColaAtenciones();
		ColaMascotas auxm=new ColaMascotas();
		while(!m1.esvacio()) {
			Mascota x=m1.eliminar();
			while(!a1.esvacio()) {
				Atencion y=a1.eliminar();
				if(y.getIdMascota()==x.getIdMascota()) {
					
				}
			}
		}
	}

}
