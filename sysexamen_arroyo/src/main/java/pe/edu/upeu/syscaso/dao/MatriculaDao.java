package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Matricula;

public interface MatriculaDao {
	Matricula create(Matricula c);
	Matricula update(Matricula c);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();
}
