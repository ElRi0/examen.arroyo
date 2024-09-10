package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.EmpleadoDao;
import pe.edu.upeu.syscaso.entity.Empleado;
import pe.edu.upeu.syscaso.repository.EmpleadoRepository;

@Component
public class EmpleadoDaoImpl implements EmpleadoDao {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public Empleado create(Empleado c) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(c);
	}

	@Override
	public Empleado update(Empleado c) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(id);

	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

}
