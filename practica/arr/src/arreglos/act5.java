package arreglos;

public class act5 {
	public static final int MAX=10;
	public static void main (String[]args) {
		int [] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		mostrar_arreglo(arr);
		invertir_arreglo(arr);
	}
	public static void invertir_arreglo(int [] arr) {
		int j=0;
		for(int i=MAX-1; i>=0; i--) {
			System.out.print(arr[i]+" | ");
		}
	}
    public static void mostrar_arreglo(int [] arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | " );
        }
        System.out.println();
    }   
}
