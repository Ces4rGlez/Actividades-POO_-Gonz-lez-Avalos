package mx.utng.s25.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.s25.model.dao.IuserDao;
import mx.utng.s25.model.entity.Usuario;
/* 
//Está basada en el patrón de diseño facade
Un unico punto de acceso hacia distintos DAOs
*/
@Service
public class UserServiceImp implements IUserService {

    @Autowired
    private IuserDao userDao;

   @Transactional(readOnly=true)

    @Override
    public List<Usuario> list() {
       return userDao.list();

        
    }
 @Transactional
    @Override
    public void save(Usuario user) {
        userDao.save(user);
    }
@Transactional(readOnly = true)
    @Override
    public Usuario getById(Long id) {
        return userDao.getById(id);
    }
@Transactional
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
    
}
