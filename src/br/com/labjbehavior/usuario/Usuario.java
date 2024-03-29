package br.com.labjbehavior.usuario;

public class Usuario {
	
	private String nome;
	private String login;
	private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public void validarNovaSenha() throws Exception{
		if(this.getSenha().length()<5){
			throw new Exception("A senha deve conter ao menos 5 caracteres.");
		}
	}
}
