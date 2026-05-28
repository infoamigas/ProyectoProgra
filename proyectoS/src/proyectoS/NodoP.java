package proyectoS;

public class NodoP {
	private String idPrograma;
	private NodoP sig;
	public NodoP() {
		sig=null;
	}
	public String getIdPrograma() {
		return idPrograma;
	}
	public void setIdPrograma(String idPrograma) {
		this.idPrograma = idPrograma;
	}
	public NodoP getSig() {
		return sig;
	}
	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	
	

}
