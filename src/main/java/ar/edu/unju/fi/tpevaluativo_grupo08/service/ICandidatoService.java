package ar.edu.unju.fi.tpevaluativo_grupo08.service;

import ar.edu.unju.fi.tpevaluativo_grupo08.model.Candidato;
import ar.edu.unju.fi.tpevaluativo_grupo08.util.ListaCandidato;

public interface ICandidatoService {
	public Candidato getCandidato();
	public boolean guardarCandidato(Candidato candidato);
	public ListaCandidato getListaCandidato();
	public Candidato buscarCandidato(int codigo);
	public void modificarCandidato(Candidato candidato);
	public void eliminarCandidato(int codigo);
	public void guardarVoto(int codigo);
}
