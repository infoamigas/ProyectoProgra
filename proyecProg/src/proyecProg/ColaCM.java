package proyecProg;

public class ColaCM {
	private int max = 50;
	Mencion v[] = new Mencion[max+1];
	private int ini, fin;
	ColaCM(){
		ini = fin = 0;
	}
	boolean esvacia()
    {
        if(nroelem()==0)
            return true;
        return false;
    }
    boolean esllena()
    {
        if(nroelem()==max)
            return true;
        return false;
    }
    int nroelem()
    {
        if(ini == 0 && fin == 0)
        	return 0;
        else {
        	if(fin > ini)
        		return fin-ini;
        	else
        		return max-ini+fin;
        }
    }
    void adicionar(Mencion elem)
    {
        if(!esllena())
        {
        	if(fin == max)
        		fin = 1;
        	else
        		fin = fin +1;
            v[fin]=elem;
        }
        else
            System.out.println("Cola llena...");
    }
    Mencion eliminar()
    {
        Mencion elem=null;
        if(!esvacia())
        {
        	elem=v[ini+1];
        	ini=ini+1;
            if(ini==max)
                ini=1;
            if(ini==fin)
                ini=fin=0;
        }
        else
            System.out.println("Cola Vacia...");
        return elem;
    }
    void mostrar() {
    	int n = nroelem();
        for(int i = 1; i <= n; i++) {
        	Mencion x = eliminar();
        	x.mostrar();
        	adicionar(x);
        }
    }
    void vaciar(ColaCM z)
    {
        while(!z.esvacia())
            adicionar(z.eliminar());
    }
    
}
