package proyectoS;

public class Main {

	public static void main(String[] args) {
		ColaSF U=new ColaSF();
		ListaC CF1=new ListaC();
		ListaC CF2=new ListaC();
		ListaC CF3=new ListaC();
		ListaC CF4=new ListaC();
		ListaC CF5=new ListaC();
		ListaC CF6=new ListaC();
		ListaC CF7=new ListaC();
		ListaC CF8=new ListaC();
		ListaC CF9=new ListaC();
		ListaC CF10=new ListaC();
		ListaC CF11=new ListaC();
		ListaC CF12=new ListaC();
		ListaC CF13=new ListaC();
		
		U.adicionar(new Facultad(1,"Facultad de Agronomía","FA",1982,"Agropecuaria y recursos naturales","Forma profesionales en producción agropecuaria, agronomía, agroindustria y veterinaria.",CF1));
		U.adicionar(new Facultad(2,"Facultad de Arquitectura, Artes, Diseño y Urbanismo","FAADU",1955,"Arquitectura, artes y urbanismo","Forma profesionales en arquitectura, artes plásticas, diseño gráfico y planificación urbana.",CF2));
		U.adicionar(new Facultad(3,"Facultad de Ciencias Económicas y Financieras","FCEF",1937,"Ciencias económicas y financieras","Forma profesionales en administración de empresas, contaduría pública y economía.",CF3));
		U.adicionar(new Facultad(4,"Facultad de Ciencias Farmacéuticas y Bioquímicas","FCFB",1904,"Ciencias de la salud y bioquímica","Forma profesionales en bioquímica y química farmacéutica.",CF4));
		U.adicionar(new Facultad(5,"Facultad de Ciencias Geológicas","FCG",1964,"Ciencias de la tierra","Forma profesionales en ingeniería geográfica, geológica, catastro y áreas relacionadas.",CF5));
		U.adicionar(new Facultad(6,"Facultad de Ciencias Puras y Naturales","FCPN",1966,"Ciencias exactas y naturales","Forma profesionales en biología, química, física, matemática, estadística e informática.",CF6));
		U.adicionar(new Facultad(7,"Facultad de Ciencias Sociales","FCS",1984,"Ciencias sociales","Forma profesionales en antropología, arqueología, comunicación social, sociología y trabajo social.",CF7));
		U.adicionar(new Facultad(8,"Facultad de Derecho y Ciencias Políticas","FDCP",1830,"Ciencias jurídicas y políticas","Forma profesionales en derecho, ciencias políticas y gestión pública.",CF8));
		U.adicionar(new Facultad(9,"Facultad de Humanidades y Ciencias de la Educación","FHCE",1966,"Humanidades y educación","Forma profesionales en educación, filosofía, historia, lingüística, literatura, psicología, turismo y ciencias de la información.",CF9));
		U.adicionar(new Facultad(10,"Facultad de Ingeniería","FI",1929,"Ingeniería y tecnología aplicada","Forma profesionales en distintas ramas de la ingeniería como civil, eléctrica, electrónica, industrial, mecánica, química, petrolera y otras.",CF10));
		U.adicionar(new Facultad(11,"Facultad de Medicina, Enfermería, Nutrición y Tecnología Médica","FMENT",1834,"Ciencias de la salud","Forma profesionales en medicina, enfermería, nutrición y tecnología médica.",CF11));
		U.adicionar(new Facultad(12,"Facultad de Odontología","FO",1924,"Salud odontológica","Forma profesionales en odontología.",CF12));
		U.adicionar(new Facultad(13,"Facultad de Tecnología","FT",1972,"Tecnología e industria","Forma profesionales técnicos y tecnológicos en aeronáutica, construcciones civiles, electricidad, electrónica, electromecánica, mecánica, química industrial y geodesia.",CF13));
		PilaP P=new PilaP();
		P.adicionar(new Programa(1,5,"Catastro y Ordenamiento Territorial","3 años"));
		P.adicionar(new Programa(2,6,"Ciencia y Tecnología de la Energíal","5 años"));
		P.adicionar(new Programa(3,8,"Derecho Naciones Originarias","3 años"));
		P.adicionar(new Programa(4,9,"Lingüística e Idiomas","5 años"));
		P.adicionar(new Programa(5,10,"Ingeniería Electromecánica","4 años"));
		P.adicionar(new Programa(6,10,"Ingeniería en Litio y Recursos Evaporíticos","5 años"));
		P.adicionar(new Programa(7,10,"Ingeniería en Seguridad Industrial y Salud Ocupacional","5 años"));
		P.adicionar(new Programa(8,10,"Ingeniería en Polímeros","5 años"));
		P.adicionar(new Programa(9,10,"Ingeniería Siderúrgica","5 años"));
		P.adicionar(new Programa(10,10,"Ingeniería en Producción Industrial","5 años"));
		P.adicionar(new Programa(11,10,"Ingeniería Ambiental","4 años"));
		P.adicionar(new Programa(12,10,"Ingeniería Mecatrónica","5 años"));
		P.adicionar(new Programa(13,10,"Ingeniería de Alimentos","4.5 años"));
		P.adicionar(new Programa(14,10,"Ingeniería Petroquímica","4 o 4.5 años"));
		P.adicionar(new Programa(15,10,"Ingeniería Biomédica","5 años"));
		P.adicionar(new Programa(16,11,"Fonoaudiología","5 años"));
		P.adicionar(new Programa(17,11,"Terapia Ocupacional","5 años"));
		U.mostrar();
		P.mostrar();
		
	}

}
