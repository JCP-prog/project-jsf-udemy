package com.jimmycp.prjectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author JimmyC Clase que permite controlar el funcionamiento con la pantalla
 *         de login.xhtml
 *
 */

@ManagedBean
public class LoginController {

	/**
	 * Usuario que ingresa en el Login
	 */
	private String usuario = "";

	/**
	 * Contraseña ingresada en el Login
	 */
	private String password;

	/**
	 * Metodo que permite ingresar a la pantalla principal del Proyecto
	 */
	public void ingresar() {
		// System.out.println("Usuario: " + usuario);
		if (usuario.equals("jimmyc") && password.equals("1234")) {
			//FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
			//		new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Correcto", ""));
			
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
				e.printStackTrace();
			}
			
			
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o Contraseña incorrectos", ""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
