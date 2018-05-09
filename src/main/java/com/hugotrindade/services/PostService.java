package com.hugotrindade.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugotrindade.domain.Post;
import com.hugotrindade.repository.PostRepository;
import com.hugotrindade.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> optional = repository.findById(id);
		return optional.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	

}
