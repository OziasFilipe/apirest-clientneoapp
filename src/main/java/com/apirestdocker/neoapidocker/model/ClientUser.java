package com.apirestdocker.neoapidocker.model;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Component
@RequestMapping(value="/")
@Entity
@Table(name = "Cliente")
    public class ClientUser{

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id", nullable = false)
		private Long Id;
    
		@Column(name = "nome", nullable = false)
        private String Nome;
		
		@Column(name = "endereco", nullable = false)
        private String Endereco;
		
		@Column(name = "cidade", nullable = false)
        private String Cidade;
		
		@Column(name = "bairro", nullable = false)
        private String Bairro;
		
		@Column(name = "estado", nullable = false)
        private String Estado;
		
		@Column(name = "cep", nullable = false)
        private Long Cep;
		
		@Column(name = "telefone", nullable = false)
        private Long Telefone;
		
		@Column(name = "email", nullable = false)
        private String Email;
		
		@Column(name = "anoNascimento", nullable = false,length = 4)
		private Long AnoNascimento;
		
		@Column(name = "idade", nullable = false)
        private Long Idade;

		
		/*Métodos Get e Set para inserção e busca no banco de dados: OBS: @Getter e @Setter não funcionou!*/
		
		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			this.Id = id;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public String getEndereco() {
			return Endereco;
		}

		public void setEndereco(String endereco) {
			Endereco = endereco;
		}

		public String getCidade() {
			return Cidade;
		}

		public void setCidade(String cidade) {
			Cidade = cidade;
		}

		public String getBairro() {
			return Bairro;
		}

		public void setBairro(String bairro) {
			Bairro = bairro;
		}

		public String getEstado() {
			return Estado;
		}

		public void setEstado(String estado) {
			Estado = estado;
		}

		public Long getCep() {
			return Cep;
		}

		public void setCep(Long cep) {
			Cep = cep;
		}

		public Long getTelefone() {
			return Telefone;
		}

		public void setTelefone(Long telefone) {
			Telefone = telefone;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public long getDataNascimento() {
			return AnoNascimento;
		}

		public void setDataNascimento(long Ano) {
			AnoNascimento = Ano;
		}

		public long getIdade() {
			return Idade;
		}

		public void setIdade(long idade) {
			
			Idade = 2021 - this.AnoNascimento  ;
		}
 
		
}
