package br.com.tracknirv.aceleramemoria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.tracknirv.aceleramemoria.configs.ControllerConfig;
import br.com.tracknirv.aceleramemoria.converties.UsuarioConvert;
import br.com.tracknirv.aceleramemoria.entities.UsuarioEntity;
import br.com.tracknirv.aceleramemoria.inputies.UsuarioCadastroInput;

@RestController
@RequestMapping(ControllerConfig.PRE_URL+"")
@CrossOrigin(origins = {"http://localhost:3000"})
public class UsuarioController {

	@Autowired
	UsuarioConvert usuarioConvert; 
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void cadastra(@RequestBody UsuarioCadastroInput usuarioCadastroInput) {
		UsuarioEntity usuarioEntity = usuarioConvert.cadastroInputToEntity(usuarioCadastroInput);
				
	}
	
}
