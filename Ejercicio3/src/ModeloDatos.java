import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class ModeloDatos {
	HashMap<String, ArrayList<String>> mapEmpleados;
	public ModeloDatos() {
		mapEmpleados=new HashMap<String, ArrayList<String>>();
	}
	public void consultarEmpleado (String documento) {
		if (mapEmpleados.containsKey(documento)) {
		System.out.println(mapEmpleados.get(documento));
		}else {
		JOptionPane.showMessageDialog(null, "Documento no existe",
		"Advertencia",JOptionPane.WARNING_MESSAGE);
		}
		}
	public HashMap<String, ArrayList<String>> getMapaEstudiantes(){
		return mapEmpleados;
		}
	public void guardarDatos(ArrayList<String> listaEmpleados) {
		mapEmpleados.put(listaEmpleados.get(0), listaEmpleados);
		JOptionPane.showMessageDialog(null, "Registro existoso!");
		}
	public int getSizeMap() {
		return mapEmpleados.size();
		}
	public void imprimirMapa() {
		for (String documento:mapEmpleados.keySet()) {
		System.out.println(documento + " - "+mapEmpleados.get(documento));
		}
		}

}
