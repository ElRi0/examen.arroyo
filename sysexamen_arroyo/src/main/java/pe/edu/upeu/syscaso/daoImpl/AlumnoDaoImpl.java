package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.AlumnoDao;
import pe.edu.upeu.syscaso.entity.Alumno;
import pe.edu.upeu.syscaso.repository.AlumnoRepository;

@Component
public class AlumnoDaoImpl implements AlumnoDao{
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public Alumno create(Alumno c) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(c);
	}

	@Override
	public Alumno update(Alumno c) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);

	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

}
