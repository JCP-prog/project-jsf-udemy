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
		Empleado empleadoNetFlix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
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
		
		empleadoNetFlix.setNombre("Maria");
		empleadoNetFlix.setPrimerApellido("Paniagua");
		empleadoNetFlix.setSegundoApellido("Lopez");
		empleadoNetFlix.setPuesto("Senior Developer Java");
		empleadoNetFlix.setStatus(true);
		
		empleadoAmazon.setNombre("Juan");
		empleadoAmazon.setPrimerApellido("Lopez");
		empleadoAmazon.setSegundoApellido("Romero");
		empleadoAmazon.setPuesto("CEO");
		empleadoAmazon.setStatus(true);
		
		empleadoHP.setNombre("Jesus");
		empleadoHP.setPrimerApellido("Lopez");
		empleadoHP.setSegundoApellido("Romero");
		empleadoHP.setPuesto("Architect");
		empleadoHP.setStatus(false);
		
		empleadoOracle.setNombre("Elizabeth");
		empleadoOracle.setPrimerApellido("Paniagua");
		empleadoOracle.setSegundoApellido("Lopez");
		empleadoOracle.setPuesto("Senior Developer Java");
		empleadoOracle.setStatus(true);
		
		empleadoDeloitte.setNombre("Alex");
		empleadoDeloitte.setPrimerApellido("Lopez");
		empleadoDeloitte.setSegundoApellido("Romero");
		empleadoDeloitte.setPuesto("CEO");
		empleadoDeloitte.setStatus(true);
		
		empleadoDisney.setNombre("Nicolas");
		empleadoDisney.setPrimerApellido("Lopez");
		empleadoDisney.setSegundoApellido("Romero");
		empleadoDisney.setPuesto("Architect");
		empleadoDisney.setStatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoNetFlix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
		
		return empleados;
	}
}
