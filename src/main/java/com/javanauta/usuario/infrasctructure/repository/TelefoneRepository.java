package com.javanauta.usuario.infrasctructure.repository;

import com.javanauta.usuario.infrasctructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
