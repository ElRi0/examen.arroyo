package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.GradoDao;
import pe.edu.upeu.syscaso.entity.Grado;
import pe.edu.upeu.syscaso.repository.GradoRepository;

@Component
public class GradoDaoImpl implements GradoDao{

	@Autowired
	private GradoRepository gradoRepository;
	
	@Override
	public Grado create(Grado c) {
		// TODO Auto-generated method stub
		return gradoRepository.save(c);
	}

	@Override
	public Grado update(Grado c) {
		// TODO Auto-generated method stub
		return gradoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		gradoRepository.deleteById(id);

	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return gradoRepository.findById(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return gradoRepository.findAll();
	}

}
