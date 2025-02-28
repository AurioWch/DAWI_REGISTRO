package com.cibertec.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Categoria;
import com.cibertec.service.CategoriaService;

@RestController
@RequestMapping("/rest/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@ResponseBody
	@GetMapping("/listaCategoria")
	public List<Categoria> lista(){
		List<Categoria> lstSalida =  service.listaCategoriaOrdenada();
		return lstSalida;
	}
}