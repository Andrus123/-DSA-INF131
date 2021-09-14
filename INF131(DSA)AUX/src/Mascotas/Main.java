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
		System.out.println("A)");
		MostrarMascotaenFecha(a1,m1,"3/09/2021");
		//b Mostrar las mascotas que fue atendida más veces en la clinica veterinaria
		System.out.println("B)");
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
	private static void MascotaMasAtendida(ColaAtenciones a1, ColaMascotas m1){
		int max=MaximoCantidadAtencions(a1,m1);
		ColaMascotas aux= new ColaMascotas();
		System.out.println("Mascota más atendida: ");
		while(!m1.esvacio()) {
			Mascota x=m1.eliminar();
			if(ContarAtencionesMascota(x.getIdMascota(),a1)==max)
				x.mostrar();
			aux.adicionar(x);
		}
		while(!aux.esvacio())
			m1.adicionar(aux.eliminar());
	}
	private static int MaximoCantidadAtencions(ColaAtenciones a1, ColaMascotas m1) {
		// TODO Auto-generated method stub
		int max=0;
		ColaMascotas aux=new ColaMascotas();
		while(!m1.esvacio()) {
			Mascota x=m1.eliminar();
			if(ContarAtencionesMascota(x.getIdMascota(),a1)>max)
				max=ContarAtencionesMascota(x.getIdMascota(),a1);
			aux.adicionar(x);
		}
		while(!aux.esvacio())
			m1.adicionar(aux.eliminar());
		return max;
	}
	private static int ContarAtencionesMascota(int idMascota, ColaAtenciones a1) {
		// TODO Auto-generated method stub
		int cont=0;
		ColaAtenciones aux=new ColaAtenciones();
		while(!a1.esvacio()) {
			Atencion x=a1.eliminar();
			if(x.getIdMascota()==idMascota)
				cont++;
			aux.adicionar(x);
		}
		while(!aux.esvacio())
			a1.adicionar(aux.eliminar());
		return cont;
	}
}
