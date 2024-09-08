package com.vet.vetApp.repository;

import com.vet.vetApp.model.Mascota;
import com.vet.vetApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {

    List<Mascota> findByusuarioAmo(Usuario usuario);
}
