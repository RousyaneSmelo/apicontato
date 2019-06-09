package com.projetoapi.contato.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.projetoapi.contato.dto.ContatoDTO;
import com.projetoapi.contato.dto.TelefoneDTO;

import lombok.Data;

@Data
@Table(name = "contato")
@Entity
public class Contato implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", columnDefinition = "INT(10) NOT NULL")
	private Long id;
	@Column(name = "nome", columnDefinition = "VARCHAR(250)")
	private String nome;
	@Column(name = "email", columnDefinition = "VARCHAR(250)")
	private String email;
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Telefone> telefones;
	
	
	public Contato(ContatoDTO dto) {
		super();
		this.id = dto.getId() != null ? dto.getId() : null;
		this.nome = dto.getNome();
		this.email = dto.getEmail();
		List<Telefone> fones = new ArrayList<>();
		for(TelefoneDTO foneDto : dto.getTelefones()) {
			fones.add(new Telefone(foneDto));
		}
		this.telefones = fones;
	}


	public Contato() {
		super();
	}
	
	
	
	
	
}
