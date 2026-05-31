package proyecProg;

public class Mencion {
	private int idCarrera, idMencion;
	private String nombre, descripcion;
	public Mencion(int idCarrera, int idMencion, String nombre, String descripcion) {
		this.idCarrera = idCarrera;
		this.idMencion = idMencion;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public int getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}
	public int getIdMencion() {
		return idMencion;
	}
	public void setIdMencion(int idMencion) {
		this.idMencion = idMencion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void mostrar() {
		System.out.println("     "+idCarrera+" "+idMencion+" "+nombre+" "+descripcion);
	}
}
