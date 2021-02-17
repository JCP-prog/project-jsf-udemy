/**
 * 
 */
package com.jimmycp.prjectjsf.entity;

/**
 * @author JimmyC
 * Clase que representa entidades de Empleados
 */
public class Empleado {
	/**
	 * Nombre del Empleado
	 */
	private String nombre;
	/**
	 * Primer Apellido del Empleado
	 */
	private String primerApellido;
	/**
	 * Segundo Apellido del Empleado
	 */
	private String segundoApellido;
	/**
	 * Puesto del Empleado
	 */
	private String puesto;
	/**
	 * Estado Actual del Empleado
	 */
	private boolean status;

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

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
