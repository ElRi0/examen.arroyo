package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Grado;

public interface GradoDao {
	Grado create(Grado c);
	Grado update(Grado c);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}
