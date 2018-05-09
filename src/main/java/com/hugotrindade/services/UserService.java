package com.hugotrindade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugotrindade.domain.User;
import com.hugotrindade.repository.UserRepository;
import com.hugotrindade.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> optional = repository.findById(id);
		return optional.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
