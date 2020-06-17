package br.com.eduardo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.eduardo.model.Veiculo;
import br.com.eduardo.repository.VeiculoRepository;

@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	@GetMapping ("/veiculos")
	public ModelAndView listarVeiculo () {
		ModelAndView mav = new ModelAndView("lista_veiculos");
		
		List<Veiculo> veiculos = veiculoRepository.findAll();
		mav.addObject("veiculos", veiculos);
		
		return mav;
		
	}
}