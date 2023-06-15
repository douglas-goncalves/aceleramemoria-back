package br.com.tracknirv.aceleramemoria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class UsuarioEntity {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nome_completo", length = 150, unique = true)
	private String nomeCompleto;
	
	@Column(name="email", length = 255, unique = true)
	private String email;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="senha_alterada")
	private boolean senhaAlterada;
	
	@Column(name="dados_completos",length = 4000)
	private String dadosCompletos;
	
	@Column(name="ativo")
	private boolean ativo;	
}
