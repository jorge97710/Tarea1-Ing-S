import java.util.*;

public class Controlador_usuario {
	int tipo;
	boolean autorizacionCaja = false;
	boolean autorizacionInventario = false;
	int resp = 11;
	Controlador_juguetes control;

	Scanner sn = new Scanner(System.in);
	
	public Controlador_usuario(int tipo) {
		control = new Controlador_juguetes();
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void mostrarMenu() {
		while (resp!=0) {
			if (tipo >= 1) {
				System.out.println("1. Buscar Juguete (codigo)"); //visualizar juguetes, categorias y precios
		        System.out.println("2. Juguetes mecanicos segun complejidad");
		        System.out.println("3. Juguetes electronicos y precios");
		    if(tipo >=2 || autorizacionCaja==true || autorizacionInventario==true) {
		        System.out.println("4. Editar juguete"); //ademas, editar cantidades en existencia y precios, agregar nuevos productos
		        System.out.println("5. Agregar(x) o eliminar(y) juguete"); //ademas, editar cantidades en existencia y precios, agregar nuevos productos
		        System.out.println("6. Agregar(x) o eliminar(y) proveedor"); //ademas, editar cantidades en existencia y precios, agregar nuevos productos
		    }
		    if(tipo==3 || autorizacionCaja==true || autorizacionInventario==true) {
		    	System.out.println("7. Dar acceso a encargado de caja");
		    	System.out.println("8. Dar acceso a encargado de inventario");
		    	System.out.println("9. Estadisticas de ventas");
		    }
		    else {
			    System.out.println("Debe de ingresar un numero entre 0 y 9");
		    }
		    System.out.println("0. Salir");
		    resp = sn.nextInt();
	        
		    if(resp==1) {
		    	control.buscar_juguete();
		    }
		    if(resp==2) {
		    	control.complejidad_Mec();
		    }
		    if(resp==3) {
		    
		    }
		} 
	        
		}
	}

	
}
