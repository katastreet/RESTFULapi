package com.publickeyrest.springboot.respository;

import org.springframework.data.repository.CrudRepository;

import com.publickeyrest.springboot.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	//auto implemented in bean called userRepository
	//CRUD
	
	
	//findBy[entityname] automatically implements the method
	public User findByusername(String username);
}


