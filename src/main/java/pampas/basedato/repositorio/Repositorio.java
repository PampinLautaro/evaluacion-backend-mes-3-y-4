package pampas.basedato.repositorio;

import java.util.List;

public interface Repositorio<T> {

	List<T> listar();
	
	T porId(Long idAsignatura);
	
	void guardar(T t);
	
	void eliminar(Long idAsignatura);
}
