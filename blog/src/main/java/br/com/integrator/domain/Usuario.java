package br.com.integrator.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Created by http://www.devmedia.com.br/
 * User: Marcio Ballem
 * Date: 21/01/12
 * Time: 19:33
 * Classe de entidade com anotações para o mapeamento do hibernate.
 */
@Entity
@Table(name = "USUARIOS")
@NamedQuery(name = "Usuario.findByDtCadastro",
        query = "select u from Usuario u where u.dtCadastro =?1"
)
@XmlRootElement(name = "Usuario")
public class Usuario extends AbstractPersistable<Long> {
    @Column(name = "LOGIN", length = 30, nullable = false, unique = true)
    private String login;
    @Column(name = "SENHA", length = 6, nullable = false, unique = false)
    private String senha;
    @Column(name = "DATA_CADASTRO", nullable = false, unique = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @Column(name = "IDADE", nullable = false, unique = false)
    private int idade;

    public Usuario(String login, String senha, Date dtCadastro, int idade) {
        this.login = login;
        this.senha = senha;
        this.dtCadastro = dtCadastro;
        this.idade = idade;
    }

    public Usuario() {
        super();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

