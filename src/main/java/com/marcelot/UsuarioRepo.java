package com.marcelot;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
	
	List<Usuario> findByNome(String name);

	Usuario findById(int id);

	Usuario findCustomerById(Integer id);
}
