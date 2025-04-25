package arreglos;

public class act35 {
	public static final int MAX=10;
	public static void main (String[]args) {
		int [] arr= {2, 4, 7, 10, 12, 15, 18, 20, 22, 25};
		int elemento=21;
		mostrar_arreglo(arr);
		agregar_elemento(arr, elemento);
		mostrar_arreglo(arr);
	}
	public static void agregar_elemento(int [] arr, int elemento) {
		int i=0;
		while(i<MAX-1) {
			if(posicionEncontrada(arr)) {
				corrimiento_derecha(arr, i);
				arr[i]=elemento;
			}else{
				i++;
			}
		}
	}
	public static boolean posicionEncontrada(int [] arr) {
		int i=0;
		while(i<MAX-1 && arr[i]>=arr[i+1]) {
			i++;
		}
		if(i<MAX-1) {
			return true;
		}else {
			return false;
		}
	}
	public static void corrimiento_derecha(int [] arr, int pos) {
		for(int i=MAX-1; i>pos;i--) {
			arr[i]=arr[i-1];
		}
	}
    public static void mostrar_arreglo(int [] arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | " );
        }
        System.out.println();
    } 
}
