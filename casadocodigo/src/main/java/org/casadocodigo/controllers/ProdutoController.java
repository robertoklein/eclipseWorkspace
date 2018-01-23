package org.casadocodigo.controllers;

import org.casadocodigo.dao.ProdutoDao;
import org.casadocodigo.models.Produto;
import org.casadocodigo.models.TipoPreco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoDao produtoDao;
	
	//@RequestMapping("produtos/form")
	//public String produtoForm() {
	//	return "produtos/form";
	//}
	
	@RequestMapping("/produtos/form")
    public ModelAndView form(){
        ModelAndView modelAndView = new ModelAndView("produtos/form");
        modelAndView.addObject("tipos", TipoPreco.values());
        return modelAndView;
    }
	
	@RequestMapping("/produtos")
	public String gravar(Produto produto) {
		System.out.println(produto);
		produtoDao.gravar(produto);
		return "produtos/ok";
	}
}
