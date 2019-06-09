package com.projetoapi.contato.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.projetoapi.contato.dto.TelefoneDTO;
import com.projetoapi.contato.enums.TipoTelefoneEnum;

import lombok.Data;

@Data
@Table(name = "telefone")
@Entity
public class Telefone implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", columnDefinition = "INT(10) NOT NULL")
	private Long id;
	@Column(name = "numero", columnDefinition = "VARCHAR(20)")
	private String numero;
	@Enumerated(EnumType.ORDINAL)
	private TipoTelefoneEnum tipo;
	
	public Telefone(TelefoneDTO dto) {
		super();
		this.id = dto.getId()!=null ? dto.getId() : null;
		this.numero = dto.getNumero();
		if(TipoTelefoneEnum.CELULAR.name().equals(dto.getTipo())) {
			this.tipo = TipoTelefoneEnum.CELULAR;
		}else {
			this.tipo = TipoTelefoneEnum.RESIDENCIAL;			
		}
	}

	public Telefone() {
		super();
	}
	
	
	
}
