import java.util.ArrayList;

public class Procesos {
	public int maxValorArrayList(ArrayList<Integer> listaNumeros) {
		int maximo = listaNumeros.get(0);
		for (int i = 0; i < listaNumeros.size(); i++) {
			if (listaNumeros.get(i) > maximo) {
				maximo=listaNumeros.get(i);
			}
		}
		return maximo;
	}

	    public int[] sumaArreglos(int[] arr1, int[] arr2) {
	        int resultado[] = new int[arr1.length];
	
	        for (int i = 0; i < arr1.length; i++) {
	            resultado[i] = arr1[i] + arr2[i];
	        }
	        return resultado;
	    }
}
