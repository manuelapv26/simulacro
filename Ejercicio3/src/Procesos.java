import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Procesos {
	ModeloDatos miData;
	ArrayList<String> listEmpleados;
	double descuento,sueldoFinal;
	
	public Procesos() {
		miData=new ModeloDatos();
		iniciar();
		}
	 private void iniciar() {
	    	ingresarDatos();
	    }
	    private void ingresarDatos() {
	    	listEmpleados=new ArrayList<String>();
	    	String nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
	    	String documento=JOptionPane.showInputDialog("Ingrese el documento");
	    	double sueldoActual=Double.parseDouble(JOptionPane.showInputDialog("ingrese su sueldo actual"));
	    	int estrato=Integer.parseInt(JOptionPane.showInputDialog("ingrese el estrato del empleado"));
	    	listEmpleados.add(documento);
	    	listEmpleados.add(nombre);
	    	listEmpleados.add(sueldoActual+"");
	    	listEmpleados.add(estrato+"");
	    	miData.guardarDatos(listEmpleados);
	        evaluarEstrato(estrato,sueldoActual);
	    	System.out.println("Nombre: "+nombre+", Documento: "+documento+", Estrato: "+estrato);

	}
	public int evaluarEstrato(int estrato, double sueldoActual) {
		if (estrato==1 || estrato==2) {
			descuento=sueldoActual*0.2;
			sueldoFinal= sueldoActual-descuento;
			System.out.println("El sueldo final es : "+sueldoFinal+" y su descuento fue "+descuento);
		}else if (estrato==3 || estrato==4) {
			descuento=sueldoActual*0.4;
			sueldoFinal= sueldoActual-descuento;
			System.out.println("El descuento es de: "+sueldoFinal+" y su descuento fue "+descuento);
		}else if(estrato==5) {
			descuento=sueldoActual*0.8;
			sueldoFinal= sueldoActual-descuento;
			System.out.println("El descuento es de: "+sueldoFinal+" y su descuento fue "+descuento);
		}else if(estrato==6) {
			descuento=sueldoActual*0.10;
			sueldoFinal= sueldoActual-descuento;
			System.out.println("El sueldo final es de : "+sueldoFinal+" y su descuento fue "+descuento);
		}
		return estrato;
	}
}
