package arreglos;

public class act31 {
	public static final int MAX=20, SEPARADOR=0;
	public static void main (String[]args) {
		int [] arr={0, 2, 3, 14, 5, 0, 0, 50, 6, 89, 0, 12, 3, 6, 9, 0, 65, 10, 54, 0};
		mostrar_arreglo(arr);
		invertir_secuencia(arr);
		mostrar_arreglo(arr);
	}
	public static void invertir_secuencia(int [] arr) {
		int ini=0, fin=-1;
		int ultimoInicio=0, ultimoFin=0;
		while(ini<MAX) {
			ini=BuscarInicio(arr, fin+1);
			if(ini<MAX) {
				fin=BuscarFin(arr, ini);
				ultimoInicio=ini;
				ultimoFin=fin;
			}
		}
		invertir_secuencia(arr, ultimoInicio, ultimoFin);
	}
	public static int BuscarInicio(int [] arr, int pos) {
		while(pos<MAX && arr[pos]==SEPARADOR) {
			pos++;
		}
		return pos;
	}
	public static int BuscarFin (int [] arr, int pos) {
		while(pos<MAX && arr[pos]!=SEPARADOR) {
			pos++;
		}
		return pos-1;
	}
	public static void invertir_secuencia (int [] arr, int ini, int fin) {
		while(ini<fin) {
			int aux=arr[ini];
			arr[ini]=arr[fin];
			arr[fin]=aux;
			ini++;
			fin--;
		}
	}
    public static void mostrar_arreglo(int [] arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | " );
        }
        System.out.println();
    }
}
