package proyecProg;

public class Carrera {
	private int idCarrera, idFacultad, duracion;
	private String nombreC;
	private ColaCM m;
	public Carrera(int idFacultad, int idCarrera, String nombreC, int duracion, ColaCM m) {
		this.idCarrera = idCarrera;
		this.idFacultad = idFacultad;
		this.duracion = duracion;
		this.nombreC = nombreC;
		this.m = m;
	}
	public int getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}
	public int getIdFacultad() {
		return idFacultad;
	}
	public void setIdFacultad(int idFacultad) {
		this.idFacultad = idFacultad;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getNombreC() {
		return nombreC;
	}
	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}
	public ColaCM getM() {
		return m;
	}
	public void setM(ColaCM m) {
		this.m = m;
	}
	public void mostrar() {
		System.out.println(idFacultad+" "+idCarrera+" "+nombreC+" "+duracion);
		if(m != null) {
			System.out.println("   > Mencion(es): ");
			m.mostrar();
		}
	}

}
