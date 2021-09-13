package Numeros;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaNumeros p1=new PilaNumeros();
		p1.llenar();
		p1.mostrar();
		//a Llevar todos los números pares al principio de la pila
		p1.pares();
		p1.mostrar();
		//b Eliminar los primeros n números impares
		p1.impares(1);
		p1.mostrar();
		//c Contar los numero repetidos en la pila
		p1.contar();
	}

}
