package proyectoS;



public class PilaP {
	private int max=20,tope;
	private Programa v[]=new Programa[max+1];
	PilaP() {
		tope=0;
	} 
	boolean esllena() {
		return tope==max;
	}
	boolean esvacia() {
		return tope==0;
		
	}
	int nroelem() {
		return tope;
	}
	void adicionar(Programa elem) {
		if(!esllena()) {
			v[tope+1]=elem;
			tope++;
		}
		else
			System.out.println("Pila llena");
	}
	Programa eliminar() {
		Programa elem=null;
		if (!esvacia()) {
			elem=v[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	void mostrar() {
		PilaP aux= new PilaP();
		while(!esvacia()) {
			Programa x=eliminar();
			x.mostrar();
			aux.adicionar(x);
			
		}
		vaciar(aux);
	}
	void vaciar(PilaP z) {
		while(!z.esvacia()) {
			adicionar(z.eliminar());
		}
	}

}
