package proyecProg;

public class MultiColaC {
	private int nc;
	private ColaCC v[] = new ColaCC[100];
	MultiColaC() {
		for(int i = 1; i < 99; i++)
			v[i] = new ColaCC();
	}
	public int getNc() {
		return nc;
	}
	public void setNc(int nc) {
		this.nc = nc;
	}
	public boolean esvacia(int i) {
		return v[i].esvacia();
	}
	public boolean esllena(int i) {
		return v[i].esllena();
	}
	public int nroelem(int i) {
		return v[i].nroelem();
	}
	public void adicionar(int i, Carrera elem) {
		v[i].adicionar(elem);
	}
	public Carrera eliminar(int i) {
		return v[i].eliminar();
	}
	public void mostrar(int i) {
		v[i].mostrar();
	}
	public void mostrar() {
		for(int i =1; i <= nc; i++)
			mostrar(i);
	}
	public void vaciar(int i, ColaCC z) {
		v[i].vaciar(z);
	}
	public void vaciar(int i, int j) {
		v[i].vaciar(v[j]);
	}

}
