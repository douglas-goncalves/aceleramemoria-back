package br.com.tracknirv.aceleramemoria.converties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.tracknirv.aceleramemoria.entities.UsuarioEntity;
import br.com.tracknirv.aceleramemoria.inputies.UsuarioCadastroInput;

import org.modelmapper.ModelMapper;

@Component
public class UsuarioConvert {
	
	@Autowired
	private ModelMapper modelMapper;
	

	public UsuarioEntity cadastroInputToEntity(UsuarioCadastroInput usuarioCadastroInput) {
		return modelMapper.map(usuarioCadastroInput, UsuarioEntity.class);
	}
	
	

}
