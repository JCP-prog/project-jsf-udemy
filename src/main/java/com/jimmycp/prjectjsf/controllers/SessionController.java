/**
 * 
 */
package com.jimmycp.prjectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jimmycp.prjectjsf.dto.UsuarioDto;

/**
 * @author JimmyC
 * Clase que se encarga de mantener la informacion del usuario que ingresa al aplicativo en sesion.
 */

@ManagedBean
@SessionScoped
public class SessionController {
	/**
	 * Usuario que se mantendra en sesion
	 */
	private UsuarioDto usuarioDTO;
	
	/**
	 * Inicializa la sesion del usuario.
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesion...");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDto getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDto usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
}
