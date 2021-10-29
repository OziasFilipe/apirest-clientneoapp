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
	
	@GetMapping("cliente/nome")
	@ApiOperation(value="Buscar elemento através do nome dentro do parametro")
	public List<ClientUser> nomeBusca(String nome){
		
		return repositorio.findByNome(nome);
	}
	
	@GetMapping("cliente/endereco")
	@ApiOperation(value="Buscar elemento através do endereco dentro do parametro")
	public List<ClientUser> enderecoBusca(String endereco){
		
		return repositorio.findByEndereco(endereco);
	}
	
	@GetMapping("cliente/cidade")
	@ApiOperation(value="Buscar elemento através da cidade dentro do parametro")
	public List<ClientUser> CidadeBusca(String cidade){
		
		return repositorio.findByCidade(cidade);
	}
	
	@GetMapping("cliente/bairro")
	@ApiOperation(value="Buscar elemento através do bairro dentro do parametro")
	public List<ClientUser> BairroBusca(String bairro){
		
		return repositorio.findByBairro(bairro);
	}
	
	@GetMapping("cliente/estado")
	@ApiOperation(value="Buscar elemento através do estado dentro do parametro")
	public List<ClientUser> EstadoBusca(String estado){
		
		return repositorio.findByEstado(estado);
	}
	
	@GetMapping("cliente/cep")
	@ApiOperation(value="Buscar elemento através do cep dentro do parametro")
	public List<ClientUser> CepBusca(long cep){
		
		return repositorio.findByCep(cep);
	}
	
	@GetMapping("cliente/telefone")
	@ApiOperation(value="Buscar elemento através do telefone dentro do parametro")
	public List<ClientUser> telefoneBusca(long telefone){
		
		return repositorio.findByTelefone(telefone);
	}
	
	@GetMapping("cliente/email")
	@ApiOperation(value="Buscar elemento através do Email dentro do parametro")
	public List<ClientUser> EmailBusca(String email){
		
		return repositorio.findByEmail(email);
	}
	
	
	
	@GetMapping("cliente/idade")
	@ApiOperation(value="Buscar elemento através da idade dentro do parametro")
	public List<ClientUser> idadeBusca(int idade){
		
		return repositorio.findByIdade(idade);
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
	
	@PutMapping("cliente/{Id}")
	@ApiOperation(value="Atualizar registro do cliente atraves do ID no banco de dados")
	public ClientUser atualizarCliente(@RequestBody ClientUser user, @PathVariable(value="Id")long Id) {
		user.setId(Id);
		return repositorio.save(user);
	}
}
