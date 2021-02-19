/**
 * 
 */
package com.jimmycp.prjectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.jimmycp.prjectjsf.entity.Empleado;
import com.jimmycp.prjectjsf.services.EmpleadoService;

/**
 * @author JimmyC
 * Clase Controller que se encarga de procesar informacion para la pantalla principal.xhtml
 *
 */

@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * Lista de Empleados para la Tabla
	 */
	private List<Empleado> empleados;
	/**
	 * Lista de Empleados Filtrados
	 */
	private List<Empleado> empleadosFiltrados;
	/**
	 * Servicio con los metodos que realizan la logica de negocio de Empleados.
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Metodo que se encarga d la inicializacion de la pantalla inicial
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * Metodo que consulta la lista de Empleados.
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
		
	}
	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	 * @return the empleadosFiltrados
	 */
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}
}
