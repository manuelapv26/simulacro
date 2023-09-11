import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
	HashMap<String, ArrayList<String>> mapPersonas;
	public ModeloDatos() {
		mapPersonas=new HashMap<String, ArrayList<String>>();
		}
	public HashMap <String, ArrayList<String>> getMapaEstudiantes(){
		 return mapPersonas;
		 }
     
	/*Almacenara los datos*/
	 public void guardarDatos(ArrayList<String> listaPersonas) {
		 mapPersonas.put(listaPersonas.get(0), listaPersonas);
		 JOptionPane.showMessageDialog(null, "Registro existoso!");
		 }
	 /*cantidad de registros alamacenados*/
	 public int getSizeMap() { 
		 return mapPersonas.size();
		  } 

	 public void imprimirMapa() {
		 for (String documento:mapPersonas.keySet()) {
			 System.out.println(documento + " - "+mapPersonas.get(documento));
		 }
	 }
}
     