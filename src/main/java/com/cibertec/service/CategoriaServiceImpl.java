package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Categoria;
import com.cibertec.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository repository;
	
	@Override
	public List<Categoria> listaCategoriaOrdenada() {
		return repository.listaCategoriaOrdenada();
	}

}
