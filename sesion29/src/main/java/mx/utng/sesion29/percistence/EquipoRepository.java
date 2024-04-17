package mx.utng.sesion29.percistence;

import org.springframework.data.repository.CrudRepository;
import mx.utng.sesion29.model.Equipo;

public interface EquipoRepository extends CrudRepository<Equipo , Long>{
    Iterable<Equipo> findAllByNombre(String nombre);
}
