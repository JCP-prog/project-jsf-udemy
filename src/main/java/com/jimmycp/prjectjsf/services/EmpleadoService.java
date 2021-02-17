/**
 * 
 */
package com.jimmycp.prjectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.jimmycp.prjectjsf.entity.Empleado;

/**
 * @author JimmyC
 * Clase que permite realizar la logica de negocio para empleados
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de Empleados de Empresas de TI
	 * @return {@link Empleado} lista de Empleados
	 */
	public List<Empleado> consultarEmpleados() {
		//Generar la listad e Empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setStatus(true);
		
		empleadoMicrosoft.setNombre("Luis Jesus");
		empleadoMicrosoft.setPrimerApellido("Lopez");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setStatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setStatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}
}
