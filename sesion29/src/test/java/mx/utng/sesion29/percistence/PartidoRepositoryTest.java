package mx.utng.sesion29.percistence;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.sesion29.model.Equipo;
import mx.utng.sesion29.model.Partido;
import mx.utng.sesion29.percistence.PartidoRepository;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.sesion29")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PartidoRepositoryTest {

    @Autowired
    private PartidoRepository repository;

    @BeforeAll
    void cleanDatabase() {
        repository.deleteAll(); 
    }

    @Test
    @DisplayName("Prueba guardar partido")
    void canFindByNombre() {
        Equipo local = new Equipo();
        Equipo visitante = new Equipo();
        local.setNombre("Rayados");
        visitante.setNombre("Tigres"); 

        repository.save(local); 
        repository.save(visitante); 

        Partido clasicoNorte = new Partido();
        clasicoNorte.setEquipoLocal(local);
        clasicoNorte.setEquipoVisitante(visitante);
        clasicoNorte.setMarcadorLocal(2);
        clasicoNorte.setMarcadorVisitante(1);

        assertNotNull(clasicoNorte.getId());
        assertNotEquals(0, clasicoNorte.getId());
    }
}

