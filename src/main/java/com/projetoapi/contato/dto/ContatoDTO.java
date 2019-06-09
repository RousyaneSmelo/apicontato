package com.projetoapi.contato.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.projetoapi.contato.entidades.Contato;
import com.projetoapi.contato.entidades.Telefone;

import lombok.Data;

@Data
public class ContatoDTO implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;

	private String email;

	private List<TelefoneDTO> telefones;
	


	public ContatoDTO(Contato contato) {
		super();
		this.id = contato.getId();
		this.nome = contato.getNome();
		this.email = contato.getEmail();
		List<TelefoneDTO> telefonesDTOs = new ArrayList<>();
		for(Telefone fone : contato.getTelefones()) {
			telefonesDTOs.add(new TelefoneDTO(fone));
		}
		this.telefones = telefonesDTOs;
	}


	public ContatoDTO() {
		super();
	}
	
	
	
}
