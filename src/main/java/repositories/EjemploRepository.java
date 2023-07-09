
package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Ejemplo;

@Repository
public interface EjemploRepository extends JpaRepository<Ejemplo, Integer> {

	@Query("select e from Ejemplo e where e.numero > ?1")
	Collection<Ejemplo> findMayorQue(int num);
}
