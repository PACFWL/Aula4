package com.fatec.sig1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Objetivo - essa classe recebe as requisições do cliente e retorna a view
 */
@Controller /**classe que requisicao da web*/
public class GUIMenuController {
	/**
	 * processa a requisicao localhost:8080/
	 * 
	 * @return a view html
	 */
	@GetMapping("/") /**rota da pagina menu*/
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");
	}

	/**
	 * processa a requisicao localhost:8080/clientes
	 * 
	 * @return a view html
	 */
	@GetMapping("/clientes")/**obtenha recurso get*/
	public ModelAndView formCliente() {
		return new ModelAndView("cadastrarCliente");
	}
}