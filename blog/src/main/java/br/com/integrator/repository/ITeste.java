package br.com.integrator.repository;

import java.util.Date;
import java.util.List;



import br.com.integrator.domain.Usuario;

public interface ITeste {

    public Usuario findByLogin(String login);

   
    public List<Usuario> findByIdadeBetween(int startAge, int endAge);

   
    public List<Usuario> findByDtCadastro(Date dtCadastro);

  
    public Usuario findByLoginAndSenha(String login,  String senha);
    
    public List<Usuario> findAll() ;

    
    public void delete(Usuario usuario);
    
    public void save(Usuario usuario);
    
    public void saveAndFlush(Usuario usuario);
    
    public Usuario findByLoginAndSenhaAndIdade(int idade, String senha, String login);
}


	

