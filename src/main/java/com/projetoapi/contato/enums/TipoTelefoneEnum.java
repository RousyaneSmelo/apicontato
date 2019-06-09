package com.projetoapi.contato.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoTelefoneEnum {
	
	
	RESIDENCIAL(1),
	CELULAR(2);
	
	private int tipo;
	
	TipoTelefoneEnum(int tipo) {
		this.tipo = tipo;
	}
	
	public static TipoTelefoneEnum fromName(int tipo) {
		for(TipoTelefoneEnum tipoEnum : TipoTelefoneEnum.values()) {
			if(tipoEnum.tipo == tipo){
				return tipoEnum;
			}
		}
		return null;
	}

	public int getTipo() {
		return tipo;
	}
	
	
}
