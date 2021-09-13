package Numeros;

public class PilaNumeros {
	private int tope;
	private int max = 10;
	private int v[] = new int[max+1];

	public PilaNumeros() {
		tope = 0;
	}

	boolean esvacia() {
		if (tope == 0)
			return (true);
		return (false);
	}

	boolean esllena() {
		if (tope == max)
			return (true);
		return (false);
	}

	int nroelem() {
		return (tope);
	}

	void adicionar(int elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		}
		else
			System.out.println("Pila llena");
	}
	
	int eliminar()
	{
		int elem=0;
		if(!esvacia())
		{
			elem=v[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return (elem);
	}
	void llenar() {
		adicionar(34);
		adicionar(45);
		adicionar(27);
		adicionar(15);
		adicionar(56);
		adicionar(24);
		adicionar(24);
		adicionar(54);
	}
	
	void mostrar()
	{
		System.out.println("Datos de la Pila:");
		PilaNumeros aux=new PilaNumeros();
		while(!esvacia()) {
			int elem= eliminar();
			aux.adicionar(elem);
			System.out.println(elem);
		}
		vaciar(aux);
	}
	void vaciar(PilaNumeros x) {
		while(!x.esvacia())
			adicionar(x.eliminar());
	}
	
	void pares()
	{
		PilaNumeros aux = new PilaNumeros();
		PilaNumeros aux2= new PilaNumeros();
		int par;
		while(!esvacia())
		{
			par=eliminar();
			if(par%2==0)
			aux.adicionar(par);
			else
			aux2.adicionar(par);
		}
		vaciar(aux2);
		vaciar(aux);
	}
	void impares(int x)
	{
		PilaNumeros aux = new PilaNumeros();
		PilaNumeros aux2 = new PilaNumeros();
		int impar;
		int cont=0;
		while(!esvacia())
		{
			impar=eliminar();
			if(cont!=x&&impar%2!=0) {
				cont++;
				aux.adicionar(impar);
			}
			else
				aux2.adicionar(impar);
		}
		vaciar(aux2);
	}

	public void contar() {
		// TODO Auto-generated method stub
		PilaNumeros aux = new PilaNumeros();
		PilaNumeros rst = new PilaNumeros();
		int num1,num2, cont=0;
		while(!esvacia()) {
			num1=eliminar();
			rst.adicionar(num1);
			while(!esvacia()) {
				num2=eliminar();
				if(num2==num1) {
					cont++;
					rst.adicionar(num2);
				}else {
					aux.adicionar(num2);
				}
			}
			vaciar(aux);
		}
		vaciar(rst);
		System.out.println("Numeros repetidos: "+cont);
	}

}
