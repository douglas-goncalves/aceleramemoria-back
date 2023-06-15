package br.com.tracknirv.aceleramemoria.inputies;

import jakarta.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioInput {
	
	@NotBlank(message = "O campo nome é obrigatório")
	@Length(max = 150, message = "É permitido no máximo 150 caracteres no nome completo")
	private String nomeCompleto;
	
	@NotBlank(message = "Email é obrigatório")
	@Length(max = 255, message = "É permitido no máximo 255 caracteres em Email")

	private String email;

	private String senha;
	
	
	@AssertTrue(message = "O Nome está inválido!")
	public boolean isNomeCompletoOk() {
		if (nomeCompleto == null) {
			return false;
		}
		nomeCompleto = nomeCompleto.trim();

		if (!nomeCompleto.contains(" ")) {
			return false;
		}

		String regex = "^[A-Za-zÀ-ú\\s]+";
		if (!nomeCompleto.matches(regex)) {
			return false;
		}

		return true;
	}
}
