package Estudiantes;
public class Estudiante {
	private String nom, pat, mat;
	private int ci;
	public Estudiante(String nom, String pat, String mat, int ci) {
		super();
		this.nom = nom;
		this.pat = pat;
		this.mat = mat;
		this.ci = ci;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPat() {
		return pat;
	}
	public void setPat(String pat) {
		this.pat = pat;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	@Override
	public String toString() {
		return "Estudiante [nom=" + nom + ", pat=" + pat + ", mat=" + mat + ", ci=" + ci + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	public void leer() {
		nom=Leer.dato();
		pat=Leer.dato();
		mat=Leer.dato();
		ci=Leer.datoInt();
	}
}
