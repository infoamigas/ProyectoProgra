package proyectoS;

public class NodoCr {
	private int idCarrera;
	private NodoCr sig;
	public NodoCr() {
		sig=null;
	}
	public int getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}
	public NodoCr getSig() {
		return sig;
	}
	public void setSig(NodoCr sig) {
		this.sig = sig;
	}
	
	

}
