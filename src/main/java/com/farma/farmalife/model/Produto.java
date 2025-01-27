package com.farma.farmalife.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Não é possível prosseguir sem adicionar o nome do produto!")
	@Size(min = 5, max = 100, message = "O nome deve conter no mínimo 5 caracteres!")
	private String item;
	
	@NotBlank(message = "Não é possível prosseguir sem adicionar a descricao do produto!")
	@Size(min = 5, max = 1000, message = "A descrição deve conter no mínimo 5 caracteres!")
	private String descricao;
	
	@NotBlank(message = "Não é possível prosseguir sem adicionar marca do produto!")
	@Size(min = 5, max = 100, message = "O nome da marca deve conter no mínimo 5 caracteres!")
	private String marca;
	
	@UpdateTimestamp //Para que fique marcado no sistema o momento em que o produto foi registrado.
	private LocalDateTime dataRegistro;
	
	@ManyToOne
	@JsonIgnoreProperties("Categoria")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
