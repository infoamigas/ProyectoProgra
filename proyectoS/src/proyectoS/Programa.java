package proyectoS;

public class Programa {
	private int idPrograma,idFacultad;
	private String nombreP;
	private String duracion;

	
	public Programa(int idPrograma, int idFacultad, String nombreP, String duracion) {
		this.idPrograma = idPrograma;
		this.idFacultad = idFacultad;
		this.nombreP = nombreP;
		this.duracion = duracion;
	}
	

	public int getIdPrograma() {
		return idPrograma;
	}


	public void setIdPrograma(int idPrograma) {
		this.idPrograma = idPrograma;
	}


	public int getIdFacultad() {
		return idFacultad;
	}


	public void setIdFacultad(int idFacultad) {
		this.idFacultad = idFacultad;
	}


	public String getNombreP() {
		return nombreP;
	}


	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}




	public void mostrar() {
		System.out.println("Programa [idPrograma=" + idPrograma + ", idFacultad=" + idFacultad + ", nombreP=" + nombreP
				+ ", duracion=" + duracion + "]");
	}
	
}
