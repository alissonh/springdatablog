package br.com.integrator.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.integrator.domain.Usuario;

/**
 * Created by http://www.devmedia.com.br/
 * User: Marcio Ballem
 * Date: 21/01/12
 * Time: 19:46
 * Interface IUsarioRepository com a lista de métodos criados pelo programador e que serão
 * implementados em tempo de execução pelo Spring Data.
 */
@Repository
public interface IUsarioRepository extends JpaRepository<Usuario, Long> {
    //nome do método deve conter o atributo da classe
    public Usuario findByLogin(String login);

    //palavra chave da consulta: Between
    public List<Usuario> findByIdadeBetween(int startAge, int endAge);

    //consulta por namedQuery
    public List<Usuario> findByDtCadastro(Date dtCadastro);

    //Usando named parameterss
    @Query("from Usuario where login = :login and senha = :senha")
    public Usuario findByLoginAndSenha(@Param("login")String login, @Param("senha") String senha);

    @Query("from Usuario where login = ?3 and senha = ?2 and idade = ?1")
    public Usuario findByLoginAndSenhaAndIdade(int idade, String senha, String login);
}

