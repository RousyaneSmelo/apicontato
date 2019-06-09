package com.projetoapi.contato.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetoapi.contato.dto.ContatoDTO;
import com.projetoapi.contato.servico.ContatoServico;

@RestController
@CrossOrigin
@RequestMapping("/contato")
public class ContatoControlador {
	
	@Autowired
	private ContatoServico service;
	
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ContatoDTO> listaContatos(){
		List<ContatoDTO> contatos = new ArrayList<>();
		contatos = this.service.buscarTodos();
		return contatos;
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ContatoDTO salvar(@RequestBody ContatoDTO contato) {
		return this.service.salvar(contato);
	}
	
	@RequestMapping(value = "/alterar", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ContatoDTO alterar(@RequestBody ContatoDTO contato) {
		return this.service.salvar(contato);
	}
	
	@RequestMapping(value = "/deletar", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deletar(@RequestParam Long id) {
		 this.service.delete(id);
	}
	

}
