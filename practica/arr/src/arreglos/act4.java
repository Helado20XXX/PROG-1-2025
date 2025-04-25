package arreglos;

public class act4 {
	public static final int MAX=10;
	public static void main (String[]args) {
		char [] arr= {'d', 'a', 't', 'g', '#', 'o', '0', 'q', 'n', 'z'};
		char elemento='#';
		int pos=BuscarPosElemento(arr, elemento);
		if(arr[pos]==elemento) {
			System.out.println("el elemento se encontro en la posicion "+pos);
		}else {
			System.out.println("no se encontro el elemento");
		}
	}
	public static int BuscarPosElemento(char [] arr, char elemento) {
		int i=0;
		while(i<MAX && arr[i]!=elemento) {
			i++;
		}
		return i;
	}
}
