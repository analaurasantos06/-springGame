package com.senai.analaura.prjGame.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.analaura.prjGame.entities.Jogo;
import com.senai.analaura.prjGame.repositories.JogoRepository;

@Service
public class JogoService {
	
	private final JogoRepository jogoRepository;

	public JogoService(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	
	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
	 public Jogo getJogoById(Long Id) {
		 return jogoRepository.findById(Id).orElse(null);
	 }
	 
	 public List<Jogo> getAllJogo() {
		 return jogoRepository.findAll();
	 }
	 
	 public void deleteJogo(Long id) {
		 jogoRepository.deleteById(id);
	 }
}
