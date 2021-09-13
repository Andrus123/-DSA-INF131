package Estudiantes;

public class Evaluacion {
	private int nroEva, ci, nota;

	public Evaluacion(int nroEva, int ci, int nota) {
		super();
		this.nroEva = nroEva;
		this.ci = ci;
		this.nota = nota;
	}

	public int getNroEva() {
		return nroEva;
	}

	public void setNroEva(int nroEva) {
		this.nroEva = nroEva;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Evaluacion [nroEva=" + nroEva + ", ci=" + ci + ", nota=" + nota + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	
	public void leer() {
		nroEva=Leer.datoInt();
		ci=Leer.datoInt();
		nota=Leer.datoInt();
	}
}
