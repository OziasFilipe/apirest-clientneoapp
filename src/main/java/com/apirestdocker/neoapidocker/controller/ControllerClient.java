package com.apirestdocker.neoapidocker.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apirestdocker.neoapidocker.model.ClientUser;
import com.apirestdocker.neoapidocker.repository.RepositoryClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@Api(value="Api Cliente")
@CrossOrigin(origins="*")
public class ControllerClient {
	
	@Autowired
	private RepositoryClient repositorio;

	/********** Requisição GET **********/
	
	@GetMapping("cliente")
	@ApiOperation(value="Retorna todos os registros do banco CLIENTE")
	public List<ClientUser> Cliente() {
		return repositorio.findAll();
	}
	
	@GetMapping("cliente/{Id}")
	@ApiOperation(value="Buscar elemento através do identificador na (URL)")
	public ClientUser buscarClientUserId(@PathVariable(value="Id")long id) {
		return repositorio.findById(id);
	}
	
	/********** Requisição POST *********/
	
	@PostMapping("cliente")
	@ApiOperation(value="Salvar no banco de dados um novo cliente")
	public ClientUser salvarCliente(@RequestBody ClientUser user) {
		return repositorio.save(user);
	}
	
	/********** Requisição DELETE **********/
	
	@DeleteMapping("cliente")
	@ApiOperation(value="Deletar Cliente do banco de dados")
	public void deleteCliente(@RequestBody ClientUser user) {
		repositorio.delete(user);
	}
	
	@DeleteMapping("cliente/deleteAll")
	@ApiOperation(value="Deletar todos os registros do banco de dados")
	public void deleteTodosCliente(@RequestBody ClientUser user) {
		repositorio.deleteAll();
	}
	
	@DeleteMapping("cliente/{Id}")
	@ApiOperation(value="Deletar Cliente através do identificador")
	public void deleteClienteId(@PathVariable(value="Id")long Id) {
		repositorio.delete(repositorio.findById(Id));
	}
	
	/********** Requisição PUT **********/
	
	@PutMapping("cliente")
	@ApiOperation(value="Atualizar registro do cliente no banco de dados")
	public ClientUser atualizarCliente(@RequestBody ClientUser user) {
		return repositorio.save(user);
	}
}
