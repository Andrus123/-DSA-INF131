package Estudiantes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaEstudiante pe1= new PilaEstudiante();
		pe1.llenar();
		pe1.mostrar();
		PilaEvaluacion pv1=new PilaEvaluacion();
		pv1.llenar();
		pv1.mostrar();
		// a Agrupar las evaluaciones de acuerdo al orden de los estudiantes
		// en la pila Estudiante
		SolucionA(pv1,pe1);
		pe1.mostrar();
		pv1.mostrar();
		// b Ordena las evaluaciones de cada estudiante
		SolucionA(pv1,pe1);
	}

	private static void SolucionA(PilaEvaluacion pv1, PilaEstudiante pe1) {
		// TODO Auto-generated method stub
		System.out.println("Agrupados:");
		PilaEvaluacion auxv=new PilaEvaluacion(),res=new PilaEvaluacion();
		PilaEstudiante auxs=new PilaEstudiante();
		while(!pe1.esvacia()) {
			Estudiante x=pe1.eliminar();
			while(!pv1.esvacia()) {
				Evaluacion y=pv1.eliminar();
				if(y.getCi()==x.getCi())
					res.adicionar(y);
				else
					auxv.adicionar(y);
			}
			pv1.vaciar(auxv);
			auxs.adicionar(x);
		}
		pe1.vaciar(auxs);
		pv1.vaciar(res);
	}

}
