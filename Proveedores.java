public class Proveedores {
	String nombre;
	int numero;
	String[] lista_juguetes;

	public Proveedores(String nombre, int numero, Object[] lista_juguetes) {
		this.nombre = nombre;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Object[] getLista_juguetes() {
		return lista_juguetes;
	}

}
