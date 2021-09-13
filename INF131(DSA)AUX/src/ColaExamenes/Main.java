package ColaExamenes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaSimple a=new ColaSimple();
		a.llenar();
		a.mostrar();
		//a Ordenar de mayor a menor segun la nota
		Ordenarxnota(a);
		a.mostrar();
		//b Mostrar la nota que más se repite
		Notarepetida(a);
	}

	private static void Ordenarxnota(ColaSimple a) {
		// TODO Auto-generated method stub
		System.out.println("Ordenado por notas:");
		ColaSimple aux=new ColaSimple(), rst=new ColaSimple();
		while(!a.esvacio()) {
			Examen mayor=a.eliminar();
			while(!a.esvacio()) {
				Examen x=a.eliminar();
				if(x.getNota()>mayor.getNota()) {
					aux.adicionar(mayor);
					mayor=x;
				}
				else
					aux.adicionar(x);
			}
			a.vaciar(aux);
			rst.adicionar(mayor);
		}
		a.vaciar(rst);
	}
	private static void Notarepetida(ColaSimple a) {
		ColaSimple aux=new ColaSimple();
		ColaSimple rst=new ColaSimple();
		Examen nota1,nota2;
		int rep=0;
		while(!a.esvacio()) {
			nota1=a.eliminar();
			rst.adicionar(nota1);
			while(!a.esvacio()) {
				nota2=a.eliminar();
				if(nota1.getNota()==nota2.getNota()) {
					rep=nota1.getNota();
					rst.adicionar(nota2);
				}else {
					aux.adicionar(nota2);
				}
			}
			a.vaciar(aux);
		}
		a.vaciar(rst);
		System.out.println("Nota más repetida: "+rep);
	}
}
