package com.apirestdocker.neoapidocker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.apirestdocker.neoapidocker.model.ClientUser;

@Repository
public interface RepositoryClient extends JpaRepository<ClientUser, Long>{

	ClientUser findById(long id);
	
}
