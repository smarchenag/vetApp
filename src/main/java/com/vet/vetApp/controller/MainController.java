package com.vet.vetApp.controller;

import com.vet.vetApp.model.Mascota;
import com.vet.vetApp.model.Usuario;
import com.vet.vetApp.service.IMascotaService;
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

    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("/users")
    public ResponseEntity<List<Usuario>> getUsers(){
        List<Usuario> usuariosFromDB = usuarioService.getUsuarios();
        return ResponseEntity.ok(usuariosFromDB);
    }

    @PostMapping
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.saveUsuario(usuario));
    }

    @GetMapping("/pets/{id}")
    public ResponseEntity<List<Mascota>> verMascotasUsuario(@PathVariable Long id) {
        Usuario usuarioFromDB = usuarioService.getUSuario(id);
        return ResponseEntity.ok(mascotaService.buscarUsuarioPorId(usuarioFromDB));
    }

    @PostMapping("/pets/{id}")
    public ResponseEntity<Mascota> saveMascota (@RequestBody Mascota mascota, @PathVariable Long id){
        Usuario usuarioFromDB = usuarioService.getUSuario(id);
        usuarioFromDB.addMascota(mascota);
        return ResponseEntity.ok(mascotaService.saveMascota(mascota));
    }
}
