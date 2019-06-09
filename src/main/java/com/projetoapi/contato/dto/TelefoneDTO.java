package com.projetoapi.contato.dto;

import java.io.Serializable;

import com.projetoapi.contato.entidades.Telefone;
import com.projetoapi.contato.enums.TipoTelefoneEnum;

import lombok.Data;

@Data
public class TelefoneDTO implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private Long id;

	private String numero;

	private String tipo;
	
	public TelefoneDTO(Telefone telefone) {
		super();
		this.id = telefone.getId();
		this.numero = telefone.getNumero();
		if(TipoTelefoneEnum.fromName(1).equals(telefone.getTipo())) {
			this.tipo = "RE";
		}else {
			this.tipo = "CE";			
		}
	}

	public TelefoneDTO() {
		super();
	}

	
	
}
