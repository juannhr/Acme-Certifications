
package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Ejemplo;
import repositories.EjemploRepository;

@Service
@Transactional
public class EjemploService {

	@Autowired
	private EjemploRepository ejemplorepository;


	public Collection<Ejemplo> findAll() {
		Collection<Ejemplo> ejemplo;
		ejemplo = this.ejemplorepository.findAll();

		return ejemplo;
	}

}
