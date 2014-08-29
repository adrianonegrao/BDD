package br.com.labjbehavior.scenario;

import static org.junit.Assert.*;

import org.jbehave.scenario.annotations.*;
import org.jbehave.scenario.steps.*;

import br.com.labjbehavior.usuario.*;

public class ValidacaoNovaSenhaSteps extends Steps{
	
	private Usuario usuario = new Usuario();
	private String mensagemErro;
	
	@Given("Um usuario de nome: <nome> e login: <login> e a senha: <senha>")
	public void setUp(
			@Named("nome")  String nomeUsuario, 
			@Named("login") String loginUsuario, 
			@Named("senha") String novaSenha) {
		mensagemErro = "";
		usuario.setNome(nomeUsuario);
		usuario.setLogin(loginUsuario);
		usuario.setSenha(novaSenha);
	}
	
	@When("verifico se a senha é segura")
	public void checkSenha() {
		try{
			usuario.validarNovaSenha();
		}catch(Exception e){
			mensagemErro = e.getMessage();
		}
	}
	
	@Then("Deve retornar a mensagem: <mensagem>")
	public void checkMessagem(@Named("mensagem") String mensagem) {
		assertTrue(mensagemErro.trim().equalsIgnoreCase(mensagem));
	}
}
