package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;


import com.devsuperior.dslist.entities.Game;

import com.devsuperior.dslist.services.GameBuscarService;


@RestController
@CrossOrigin(origins = "https://catalogo-games-production.up.railway.app,http://localhost:3000") 

@RequestMapping(value = "/buscar")


public class GameBuscarController {
	
	@Autowired
	private GameBuscarService gameBuscarService;
	
	
	
	
	@GetMapping(value = "/title")
	
	public List<Game> findByTitle(@RequestParam(value = "title", required = true)String title) {
		List<Game> list = gameBuscarService.findByTitleLike(title);
		return list;
	}
		
	

	
	

}
	



