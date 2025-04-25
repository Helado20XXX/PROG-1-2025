package arreglos;

public class act33 {
	public static void main (String [] args) {

        int resultado = 0;
	int valor = 1;
	switch (valor) {
	    case 0: resultado+= resultado++;
            case 1: if (resultado==1)
                      resultado += 10; 
	    case 2: resultado += 5; break;
	    case 3: resultado += 2; break;
            }
        System.out.println(resultado);
	}
}		
