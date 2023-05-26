package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.devsuperior.dslist.entities.Game;

import com.devsuperior.dslist.repositories.GameBuscarRepository;


@Service
public class GameBuscarService {
	
	@Autowired
	private GameBuscarRepository gameBuscarRepository;
	
	
	
	@Transactional(readOnly = true)
	public List<Game> findByTitleLike(String title) {
		List<Game> game = gameBuscarRepository.findByTitleContainingIgnoreCase(title);
		return game;
				
				
				
	}

	
	

}
