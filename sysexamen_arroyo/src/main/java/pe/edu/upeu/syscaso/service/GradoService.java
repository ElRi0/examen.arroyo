package pe.edu.upeu.syscaso.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Grado;

public interface GradoService {

	Grado create(Grado c);
	Grado update(Grado c);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}
