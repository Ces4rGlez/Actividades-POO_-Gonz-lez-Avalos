package mx.utng.s25.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import jakarta.persistence.PersistenceContext;
import mx.utng.s25.model.entity.Usuario;

@Repository
public class UserDaoImpt implements IuserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Usuario> list() {
        return em.createNamedQuery("from Users").getResultList();
    }

    @Override
    public void save(Usuario user) {
       if (Long.valueOf(user.getId()) != null &&  user.getId()>0) {


        em.merge(user);
        
       }else{

        em.persist(user);
       }
    }

    @Override
    public Usuario getById(Long id) {
      return em.find(Usuario.class, id);
    }

    @Override
    public void delete(Long id) {
        Usuario user = getById(id);
        em.remove(user);
    }
    
}
