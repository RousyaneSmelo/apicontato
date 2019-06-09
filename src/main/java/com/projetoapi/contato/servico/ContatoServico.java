package com.projetoapi.contato.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoapi.contato.dto.ContatoDTO;
import com.projetoapi.contato.entidades.Contato;
import com.projetoapi.contato.repositorio.ContatoRepositorio;

@Service
public class ContatoServico {
	
	@Autowired
	private ContatoRepositorio repositorio;
	
	
	public List<ContatoDTO> buscarTodos(){
		List<Contato> contatos = repositorio.findAll();
		List<ContatoDTO> retorno = new ArrayList<>();
		for (Contato contato : contatos) {
			retorno.add(new ContatoDTO(contato));
		}
		return retorno;
	}
	
	public ContatoDTO buscarPorId(Long id) {
		Optional<Contato> contato = repositorio.findById(id);
		return new ContatoDTO(contato.get());
	}
	
	public void delete(Long id) {
		repositorio.deleteById(id);
	}
	
	public ContatoDTO salvar(ContatoDTO dto) {
		return new ContatoDTO(repositorio.save(new Contato(dto)));
	}

}
