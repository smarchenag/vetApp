package com.vet.vetApp.controller;

import com.vet.vetApp.model.Usuario;
import com.vet.vetApp.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MainController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/users")
    public ResponseEntity<List<Usuario>> getUsers(){
        List<Usuario> usuariosFromDB = usuarioService.getUsuarios();
        return ResponseEntity.ok(usuariosFromDB);
    }

    @PostMapping
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.saveUsuario(usuario));
    }
}
