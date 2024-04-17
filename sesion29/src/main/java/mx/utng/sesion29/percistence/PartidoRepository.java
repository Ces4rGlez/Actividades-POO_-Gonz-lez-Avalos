package mx.utng.sesion29.percistence;

import org.springframework.data.repository.CrudRepository;

import mx.utng.sesion29.model.Partido;

public interface PartidoRepository extends CrudRepository<Partido, Long>{
    
}
