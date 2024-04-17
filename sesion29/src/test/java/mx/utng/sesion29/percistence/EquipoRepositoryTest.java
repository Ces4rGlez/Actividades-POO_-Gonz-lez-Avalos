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
import mx.utng.sesion29.percistence.EquipoRepositoryTest;;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.sesion29")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EquipoRepositoryTest {

    @Autowired
    private EquipoRepository repository;

    @BeforeAll
    void cleanDatabase(){
        repository.deleteAll();
    }

    @Test
    void canSave(){
        Equipo equipo = new Equipo();

        equipo.setNombre("America");
        equipo = repository.save(equipo);

        assertNotNull(equipo.getId());
        assertNotEquals(0, equipo.getId());
    }

    @Test
    @DisplayName("Buscar por Nombre")
    void canFindByNombre(){
        String name = "Chivas";

        Equipo equipo = new Equipo();
        equipo.setNombre(name);

        repository.save(equipo);

        Iterable<Equipo> listaEquipos = repository.findAllByNombre(name);
        //Valida que en la lista haya uno o mas elementosSS
        assertTrue(listaEquipos.iterator().hasNext());

    }
}

