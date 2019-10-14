package com.projetoapi.contato.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoapi.contato.entidades.Contato;
import com.projetoapi.contato.entidades.Telefone;


@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long>{

	List<Contato> findByNome(String nome);

	List<Contato> findByNomeNot(String nome);

	List<Contato> findByNomeContaining(String nome);

	List<Contato> findByNomeAndEmail(String nome, String email);

	List<Contato> findByNomeAndEmailNot(String nome, String email);
	
	List<Contato> findByTelefonesIsNull();
	
	List<Contato> findByTelefonesIn(List<Telefone> telefones);
	
	List<Contato> findByTelefonesNotIn(List<Telefone> telefones);
	
	List<Contato> findByTelefonesInOrderByNomeDesc(List<Telefone> telefones);
	
	List<Contato> findByNomeContainingAndTelefonesIn(String nome, List<Telefone> telefones);
}
