package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Contato;
import com.example.demo.repository.ContatoRepository;

@Controller
@RequestMapping("/contatos")
public class ContatoController {

	@Autowired
	private ContatoRepository repository;

	@GetMapping
	public ModelAndView listar() {
		List<Contato> lista = repository.findAll();

		ModelAndView modelAndView = new ModelAndView("contatos");
		modelAndView.addObject("contatos", lista);

		return modelAndView;
	}

}
