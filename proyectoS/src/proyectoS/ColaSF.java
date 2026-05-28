package proyectoS;

public class ColaSF {
	private int max=15,ini,fin;
	private Facultad v[]=new Facultad[max+1];
	ColaSF ()
	{
		ini=fin=0;
		
	}
	
	boolean esLlena() {
		if(fin==max)
			return true;
		return false;
	}
	
	boolean esVacia() {
		if((ini==0)&&(fin==0))
			return true;
		return false;
	}
	
	void adicionar(Facultad ele) {
		if(!esLlena()) {
			if(esVacia()) {
				ini=1;
			}
			fin = fin+1;
			v[fin]=ele;
		}
		else System.out.println("Cola llena");
	}
	
	Facultad eliminar() {
		Facultad dato = null;
		if(esVacia())
			System.out.println("Cola vacia");
		else {
			dato = v[ini];
			ini=ini+1;
			if(ini>fin) {
				ini=0;
				fin=0;
			}
		}
		return dato;
	}
	
	void mostrar() {
		ColaSF aux = new ColaSF();
		Facultad da;
		while(!esVacia()) {
			da = eliminar();
			da.mostrar();
			aux.adicionar(da);
		}
		while(!aux.esVacia())
			adicionar(aux.eliminar());
	}
	
	int nElem() {
		if(esVacia())
			return 0;
		return (fin-ini+1);
	}

}
