
public class Persona {

	private String nombre;
	public Persona() {
		nombre = "Paquito";
		
	}
	public Persona (String n){
		nombre = n;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	

}
