package com.vet.vetApp.service;

import com.vet.vetApp.model.Mascota;
import com.vet.vetApp.model.Usuario;

import java.util.List;

public interface IMascotaService {

    List<Mascota> buscarUsuarioPorId(Usuario usuario);

    Mascota saveMascota(Mascota mascota);
}
