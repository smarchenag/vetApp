package com.vet.vetApp.service;

import com.vet.vetApp.model.Usuario;
import com.vet.vetApp.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUSuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        if (usuario.getMascotas() != null){
            usuario.getMascotas().iterator().forEachRemaining(mascota -> mascota.setUsuarioAmo(usuario));
        }
        return usuarioRepository.save(usuario);
    }
}
