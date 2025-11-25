package com.javanauta.usuario.infrasctructure.repository;

import com.javanauta.usuario.infrasctructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
