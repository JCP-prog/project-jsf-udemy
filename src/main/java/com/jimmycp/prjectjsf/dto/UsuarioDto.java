/**
 * 
 */
package com.jimmycp.prjectjsf.dto;

/**
 * @author JimmyC
 * Clase que permitira contener la informacion del usuario en sesion
 */
public class UsuarioDto {
	/**
	 * NickName
	 */
	private String usuario;
	/**
	 * Contraseña
	 */
	private String password;
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
