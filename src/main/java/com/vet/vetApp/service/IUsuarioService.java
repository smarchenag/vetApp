package com.vet.vetApp.service;

import com.vet.vetApp.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario getUSuario(Long id);

    List<Usuario> getUsuarios();

    Usuario saveUsuario(Usuario usuario);


}
