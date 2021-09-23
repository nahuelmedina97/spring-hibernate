package com.cursojava.curso.dao;


import com.cursojava.curso.models.Usuario;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UsuarioDao {

    @Transactional
    List<Usuario> getusuarios();

    void eliminar(long id);

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
