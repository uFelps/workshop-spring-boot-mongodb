package com.felps.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felps.workshopmongo.domain.User;
import com.felps.workshopmongo.repositories.UserRepository;
import com.felps.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		List<User> users = repository.findAll();
		
		return users;
	}
	
	public User findById(String id) {
		Optional<User> obj  = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
