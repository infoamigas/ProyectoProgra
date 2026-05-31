package proyecProg;

public class ProyecProg {

	public static void main(String[] args) {
		//CARRERA: int idFacultad, int idCarrera, String nombreC, int duracion, ColaCM m
		//MENCION: int idCarrera, int idMencion, String nombre, String descripcion
		MultiColaC A = new MultiColaC();
		ColaCM m1 = new ColaCM();
		m1.adicionar(new Mencion(234,963,"Ingenieria de Sistemas","mecionInfo"));
		m1.adicionar(new Mencion(234,964,"Desarrollo de Software","mecionInfo"));
		m1.adicionar(new Mencion(234,965,"Seguridad de la información","mecionInfo"));
		m1.adicionar(new Mencion(234,966,"Ciencias de la Computación","mecionInfo"));
		m1.adicionar(new Mencion(234,967,"Inteligencia Artificial","mecionInfo"));
		m1.adicionar(new Mencion(234,968,"TIC","mecionInfo"));
		m1.adicionar(new Mencion(234,968,"Informática Industrial","mecionInfo"));
		A.adicionar(1, new Carrera(6987,3497,"Informática",4,m1));
		A.adicionar(1, new Carrera(6987,3498,"Biologia",4,null));
		A.adicionar(1, new Carrera(6987,3499,"Ciencias Químicas",4,null));
		A.adicionar(1, new Carrera(6987,3500,"Física",4,null));
		
		ColaCM m2 = new ColaCM();
		m2.adicionar(new Mencion(567,863,"Control","mecionIngElec"));
		m2.adicionar(new Mencion(567,864,"Telecomunicaciones","mecionIngElec"));
		ColaCM m3 = new ColaCM();
		m3.adicionar(new Mencion(967,463,"Produccion Industrial","mecionIngInd"));
		m3.adicionar(new Mencion(967,464,"Seguridad Industrial","mecionIngInd"));
		A.adicionar(2, new Carrera(3697,1873,"Ingeniería Electrónica",5,m2));
		A.adicionar(2, new Carrera(3697,1874,"Ingeniería Civil",5,null));
		A.adicionar(2, new Carrera(3697,1875,"Ingeniería Industrial",5,m3));
		
		ColaCM m4 = new ColaCM();
		m4.adicionar(new Mencion(349,427,"Fisioterapia","mecionMedTec"));
		m4.adicionar(new Mencion(349,428,"Bioimagenologia","mecionMedTec"));
		m4.adicionar(new Mencion(349,429,"Laboratorio Clinico","mecionMedTec"));
		A.adicionar(3, new Carrera(1245,3491,"Medicina",6,null));
		A.adicionar(3, new Carrera(1245,3492,"Enfermería",5,null));
		A.adicionar(3, new Carrera(1245,3493,"Tecnología Médica",5,m4));
		A.adicionar(3, new Carrera(1245,3494,"Nutrición y Dietética",5,null));
		
		A.setNc(3);
		A.mostrar();

	}

}
