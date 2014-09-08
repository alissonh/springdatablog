package br.com.integrator.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.integrator.domain.Usuario;
import br.com.integrator.repository.IUsarioRepository;

@Controller
@RequestMapping("/usuario/**")
public class UsuarioController {

	  @Autowired
	   private IUsarioRepository repository;
	  
	//@Autowired
	//ITeste repository;

	

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
	public String show(@PathVariable String id, ModelMap modelMap) {
		modelMap.addAttribute("usuario", repository.findByLogin(id));
		return "usuario/show";
	}	

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		modelMap.addAttribute("usuarios", repository.findAll());
		return "usuario/list";
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") String id) {
		repository.delete(repository.findByLogin(id));
		return "redirect:/usuario";
	}

	@RequestMapping(value = "/usuario/form", method = RequestMethod.GET)
	public String form(ModelMap modelMap) {
		modelMap.addAttribute("usuario", new Usuario());
		return "usuario/create";
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public String create(@ModelAttribute("usuario") Usuario usuario) {
		usuario.setDtCadastro(new Date());
		repository.save(usuario);
		
		return "redirect:/usuario";
	}

	@RequestMapping(value = "/usuario/{id}/form", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") String id, ModelMap modelMap) {
		modelMap.addAttribute("usuario", repository.findByLogin(id));
		return "usuario/update";
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String update(@ModelAttribute("usuario") Usuario usuario) {
		usuario.setDtCadastro(new Date());
		
		Usuario updtuser =repository.findByLogin(usuario.getLogin());
		
		updtuser.setDtCadastro(new Date());
		updtuser.setIdade(usuario.getIdade());
		updtuser.setSenha(usuario.getSenha());
		
	
		repository.saveAndFlush(updtuser);
		return "redirect:/usuario";
	}	

	

	
}
