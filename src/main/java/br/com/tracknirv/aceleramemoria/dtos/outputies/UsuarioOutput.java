package br.com.tracknirv.aceleramemoria.dtos.outputies;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioOutput {

	private Long id;
	
	private String email;
	
	private String nomeCompleto;

	private String senha;
	
	private boolean senhaAlterada;
	
	private String dadosCompletos;
	
	private boolean ativo;	
}
