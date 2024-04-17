package mx.utng.s25.model.service;

import java.util.List;

import mx.utng.s25.model.entity.Usuario;

public interface IUserService {
List<Usuario> list();
void save(Usuario user);
Usuario getById(Long id);
void delete(Long id);
    
} 