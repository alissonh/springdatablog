package br.com.integrator.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.integrator.domain.Usuario;

@Service("repository")
public class TesteRepository implements ITeste {

	@Override
	public Usuario findByLogin(String login) {
		// TODO Auto-generated method stub
		Usuario user = new Usuario();
		user.setDtCadastro(new Date());
        user.setIdade(12);
        user.setLogin("Ursius");
        user.setSenha("1234");
		
		return user;
	}

	@Override
	public List<Usuario> findByIdadeBetween(int startAge, int endAge) {
		// TODO Auto-generated method stub
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario user = new Usuario();
		user.setDtCadastro(new Date());
        user.setIdade(12);
        user.setLogin("Ursius");
        user.setSenha("1234");
        
        Usuario user2 = new Usuario();
		user.setDtCadastro(new Date());
        user.setIdade(12);
        user.setLogin("Kratus");
        user.setSenha("1234");
		
		lista.add(user);
		lista.add(user2);
		
		return lista;
	}

	@Override
	public List<Usuario> findByDtCadastro(Date dtCadastro) {
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<Usuario>();
		Usuario user = new Usuario();
		user.setDtCadastro(new Date());
        user.setIdade(12);
        user.setLogin("Ursius");
        user.setSenha("1234");
        
        Usuario user2 = new Usuario();
		user.setDtCadastro(new Date());
        user.setIdade(12);
        user.setLogin("Kratus");
        user.setSenha("1234");
		
		lista.add(user);
		lista.add(user2);
		
		return lista;
	}

	@Override
	public Usuario findByLoginAndSenha(String login, String senha) {
		// TODO Auto-generated method stub
		Usuario user = new Usuario();
		user.setDtCadastro(new Date());
        user.setIdade(12);
        user.setLogin("Ursius");
        user.setSenha("1234");
		
		return user;
	}

	@Override
	public Usuario findByLoginAndSenhaAndIdade(int idade, String senha,
			String login) {
		Usuario user = new Usuario();
		user.setDtCadastro(new Date());
        user.setIdade(12);
        user.setLogin("Ursius");
        user.setSenha("1234");
		
		return user;
	}

	@Override
	public List<Usuario> findAll() {
		List<Usuario> lista = new ArrayList<Usuario>();
		Usuario user = new Usuario();
		user.setDtCadastro(new Date());
        user.setIdade(12);
        user.setLogin("Ursius");
        user.setSenha("1234");
        
        Usuario user2 = new Usuario();
		user.setDtCadastro(new Date());
        user.setIdade(12);
        user.setLogin("Kratus");
        user.setSenha("1234");
		
		lista.add(user);
		lista.add(user2);
		
		return lista;
		
	}

	@Override
	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAndFlush(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
