package Libros;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaPersonas p1 = new ColaPersonas();
		p1.llenar();
		p1.mostrar();
		// Se pide eliminar aquellas Personas que
		// tengan un Libro con un numero de paginas impar
		// o si el titulo del libro empieza en una vocal
		Solucion(p1);
		p1.mostrar();
	}

	private static void Solucion(ColaPersonas p1) {
		// TODO Auto-generated method stub
		System.out.println("Filtrando Libros: ");
		ColaPersonas aux= new ColaPersonas();
		ColaPersonas elim= new ColaPersonas();
		while(!p1.esvacio()) {
			Persona dato=p1.eliminar();
			Libro libro=dato.getL();
			char titulo = libro.getTitulo().charAt(0);
			if(libro.getNroPaginas()%2!=0) {
				if(titulo=='A'||titulo=='E'
						||titulo=='I'||titulo=='O'||titulo=='U') {
					elim.adicionar(dato);
				}
			}else {
				aux.adicionar(dato);
			}
		}
		p1.vaciar(aux);
	}

}
