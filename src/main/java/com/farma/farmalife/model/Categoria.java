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
		
		@NotBlank(message = "Não é possível prosseguir sem adicionar o tipo do produto!")
		@Size(min = 5, max = 100, message = "Você deve digitar noo mínimo 5 caracteres!")
		private String tipo;
		
		@NotBlank(message = "A adição do nome da marca do produto é obrigatória!")
		@Size(min = 3, max = 100, message = "O nome da marca deve conter no mínimo 3 caracteres!")
		private String marca;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		
}