package br.com.fiap.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USER")
@SequenceGenerator(name = "user", sequenceName = "SQ_TB_USER", allocationSize = 1)
public class User {
	@Id
	@Column(name = "cd_user")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user")
	private int codigo;
	@Column(name = "nm_nome", length = 20, nullable = false)
	private String name;
	@Column(name = "dt_nascimento",length = 10, nullable = false)
	private Date dtNasc;
	@Column(name = "ds_email",length = 20, nullable = false)
	private String email;
	@Column(name = "ds_senha",length = 20, nullable = false)
	private String senha;
	
	public User() {
	}
	

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDtNasc() {
		return dtNasc;
	}


	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public String toString() {
		return "Setup [name=" + name + ", senha=" + senha + ", email=" + email + "]";
	}
}