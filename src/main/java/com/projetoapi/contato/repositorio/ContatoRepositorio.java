package com.projetoapi.contato.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoapi.contato.entidades.Contato;


@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long>{

}
