package com.vet.vetApp.service;

import com.vet.vetApp.model.Mascota;
import com.vet.vetApp.model.Usuario;
import com.vet.vetApp.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMascotaServiceImpl implements IMascotaService{

    @Autowired
    private MascotaRepository mr;

    @Override
    public List<Mascota> buscarUsuarioPorId(Usuario usuario) {
        return mr.findByusuarioAmo(usuario);
    }

    @Override
    public Mascota saveMascota(Mascota mascota) {
        return mr.save(mascota);
    }
}
