package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Alumno;

public interface AlumnoDao {
	Alumno create(Alumno c);
	Alumno update(Alumno c);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();
}
