package ar.edu.unju.fi.tpevaluativo_grupo08.service;

import ar.edu.unju.fi.tpevaluativo_grupo08.model.Usuario;
import ar.edu.unju.fi.tpevaluativo_grupo08.util.ListaUsuario;

public interface IUsuarioService {
	public Usuario getUsuario();
	public boolean guardarUsuario(Usuario usuario);
	public ListaUsuario getListaUsuario(); //Falta agregar esto
	public boolean guardarVoto(String mail);
	public Usuario buscarUsuario(String email);
	
}
