package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.MatriculaDao;
import pe.edu.upeu.syscaso.entity.Matricula;
import pe.edu.upeu.syscaso.repository.MatriculaRepository;

@Component
public class MatriculaDaoImpl implements MatriculaDao{

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Override
	public Matricula create(Matricula c) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(c);
	}

	@Override
	public Matricula update(Matricula c) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		matriculaRepository.deleteById(id);

	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return matriculaRepository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return matriculaRepository.findAll();
	}

}
