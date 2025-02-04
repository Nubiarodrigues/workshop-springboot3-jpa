package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	// método: retornar todos os usuários
	public List<User> findAll() {
		return repository.findAll();
	}

	// método: buscar por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
