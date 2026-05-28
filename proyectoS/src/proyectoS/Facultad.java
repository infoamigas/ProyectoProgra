package proyectoS;

public class Facultad {
	private int idFacultad;

	private String nombreF,sigla;
	private int añoCreacion;
	private String area,descripcion;
	private ListaC c;
	public Facultad(int idFacultad, String nombreF, String sigla, int añoCreacion, String area, String descripcion,ListaC c) {
		this.idFacultad = idFacultad;
		this.nombreF = nombreF;
		this.sigla = sigla;
		this.añoCreacion = añoCreacion;
		this.area = area;
		this.descripcion = descripcion;
		this.c = c;
	}
	public int getIdFacultad() {
		return idFacultad;
	}
	public void setIdFacultad(int idFacultad) {
		this.idFacultad = idFacultad;
	}
	public String getNombreF() {
		return nombreF;
	}
	public void setNombreF(String nombreF) {
		this.nombreF = nombreF;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getAñoCreacion() {
		return añoCreacion;
	}
	public void setAñoCreacion(int añoCreacion) {
		this.añoCreacion = añoCreacion;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ListaC getC() {
		return c;
	}
	public void setC(ListaC c) {
		this.c = c;
	}
	public void mostrar() {
		System.out.println("Facultad [idFacultad=" + idFacultad + ", nombreF=" + nombreF + ", sigla=" + sigla + ", añoCreacion="
				+ añoCreacion + ", area=" + area + ", descripcion=" + descripcion + "]");
		c.mostrar();
	}
	
	
}
