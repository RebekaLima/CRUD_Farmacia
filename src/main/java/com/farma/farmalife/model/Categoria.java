package com.farma.farmalife.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "Não é possível prosseguir sem adicionar o nome da categoria!")
		@Size(min = 5, max = 100, message = "A categoria deve conter no mínimo 5 caracteres!")
		private String nome;
		
		@NotBlank(message = "A adição da descrição da categoria é obrigatória!")
		@Size(min = 5, max = 100, message = "A descrição conter no mínimo 5 caracteres!")
		private String descricao;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		
}