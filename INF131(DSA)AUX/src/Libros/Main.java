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
	}

	private static void Solucion(ColaPersonas p1) {
		// TODO Auto-generated method stub
		
	}

}
