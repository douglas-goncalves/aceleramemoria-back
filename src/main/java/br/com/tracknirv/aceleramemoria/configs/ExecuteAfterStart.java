package br.com.tracknirv.aceleramemoria.configs;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import br.com.tracknirv.aceleramemoria.inputies.UsuarioCadastroInput;

@Configuration
public class ExecuteAfterStart implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		registerUserIfNecessary("Douglas Gonçalves","douglastbl@gmail.com");
		
	}
	
	private void registerUserIfNecessary(String nomeCompleto, String email){
		UsuarioCadastroInput usuarioCadastroInput = new UsuarioCadastroInput(); 
		usuarioCadastroInput.setNomeCompleto(nomeCompleto);
		usuarioCadastroInput.setEmail(email);		
	}

}
