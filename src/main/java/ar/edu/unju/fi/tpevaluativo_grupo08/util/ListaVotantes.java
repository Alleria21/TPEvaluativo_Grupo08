package ar.edu.unju.fi.tpevaluativo_grupo08.util;

import java.util.ArrayList;
import ar.edu.unju.fi.tpevaluativo_grupo08.model.Usuario;

public class ListaVotantes {
	private ArrayList<Usuario> usuarios;
	public ListaVotantes() {
		usuarios =new ArrayList<Usuario>();
	}
	
	public ArrayList<Usuario> getUsuario(){
		return usuarios;
	}
	
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios=usuarios;
	}
}
