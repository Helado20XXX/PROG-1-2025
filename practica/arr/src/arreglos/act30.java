package arreglos;

public class act30 {
	public static final int MAX=20, MAXPR=5, SEPARADOR=0;
    public static void main (String [] args){
        int [] arr={0, 10, 6, 4, 2, 8, 0, 50, 4, 89, 1, 7, 0, 9, 5, 9,  0, 5, 3, 0};
        int [] P= {50, 4, 89, 1, 7};
        int [] R= {2, 5, 6, 78, 9};
        mostrar_arreglo(arr, MAX);
        System.out.println("arreglo Patron");
        mostrar_arreglo(P, MAXPR);
        System.out.println("arreglo R");
        mostrar_arreglo(R, MAXPR);
        BuscarSecIgualPatron(arr, P, R);
        mostrar_arreglo(arr, MAX);
        
    }
    public static void BuscarSecIgualPatron(int [] arr, int [] p, int [] r) {
    	int ini=0, fin=-1;
    	while(ini<MAX) {
    		ini=BuscarInicio(arr, fin+1);
    		if(ini<MAX) {
    			fin=BuscarFin(arr, ini);
    			if((fin-ini+1)==MAXPR && IgualPatron(arr, ini, fin, p)) {
    				reemplazar_secuencia(arr, ini, fin, r);
    				ini=fin+1;
    			}
    		}
    	}
    }
    public static int BuscarInicio(int [] arr, int pos) {
    	while(pos<MAX && arr[pos]==SEPARADOR) {
    		pos++;
    	}
    	return pos;
    }
    public static int BuscarFin(int [] arr, int pos) {
    	while(pos<MAX && arr[pos]!=SEPARADOR) {
    		pos++;
    	}
    	return pos-1;
    }
    public static boolean IgualPatron(int [] arr, int ini, int fin, int [] p) {
    	int i=ini, j=0;
    	while(i<=fin && arr[i]==p[j]) {
    		i++;
    		j++;
    	}
    	if(i>fin) {
    		return true;
    	}else {
    		return false;
    	}
    }
    public static void reemplazar_secuencia(int [] arr, int ini, int fin, int [] r) {
    	int j=0;
    	for(int i=ini; i<=fin; i++) {
    		arr[i]=r[j];
    		j++;
    	}
    }
    public static void mostrar_arreglo(int [] arr, int MAX){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | " );
        }
        System.out.println();
    }   
}
