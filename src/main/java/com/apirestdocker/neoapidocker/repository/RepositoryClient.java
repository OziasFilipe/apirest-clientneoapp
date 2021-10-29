package com.apirestdocker.neoapidocker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.apirestdocker.neoapidocker.model.ClientUser;

@Repository
public interface RepositoryClient extends JpaRepository<ClientUser, Long>{

	ClientUser findById(long id);
	
	 @Query("FROM ClientUser WHERE nome = ?1")
	    List<ClientUser> findByNome(String nome);
	 
	 @Query("FROM ClientUser WHERE endereco = ?1")
	    List<ClientUser> findByEndereco(String endereco);
		
	 @Query("FROM ClientUser WHERE cidade = ?1")
	    List<ClientUser> findByCidade(String cidade);
	 
	 @Query("FROM ClientUser WHERE bairro = ?1")
	    List<ClientUser> findByBairro(String bairro);
	 
	 @Query("FROM ClientUser WHERE estado = ?1")
	    List<ClientUser> findByEstado(String estado);
	 
	 @Query("FROM ClientUser WHERE cep = ?1")
	    List<ClientUser> findByCep(long cep);
	 
	 @Query("FROM ClientUser WHERE telefone = ?1")
	    List<ClientUser> findByTelefone(long telefone);

	 @Query("FROM ClientUser WHERE email = ?1")
	    List<ClientUser> findByEmail(String email);
	 
	 @Query("FROM ClientUser WHERE anoNascimento = ?1")
	    List<ClientUser> findByAnoNascimento(long anoNascimento);

	 @Query("FROM ClientUser WHERE idade = ?1")
	    List<ClientUser> findByIdade(int idade);
}
