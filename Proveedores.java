
public class Proveedores {
	String nombre;
	String numero;
	String [] lista_juguetes;
	
	public Proveedores(String nombre, String numero, Object[] lista_juguetes) {
		this.nombre = nombre;
		this.numero = numero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Object[] getLista_juguetes() {
		return lista_juguetes;
	}


}
