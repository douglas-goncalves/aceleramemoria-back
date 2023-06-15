package br.com.tracknirv.aceleramemoria.inputies;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioCadastroInput {
	private String nomeCompleto;
	
	private String email;

	private String senha;
}
