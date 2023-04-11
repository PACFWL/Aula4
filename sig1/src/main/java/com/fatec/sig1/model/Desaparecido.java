package com.fatec.sig1.model;
/**import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;**/
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.br.CPF;
/**import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;**/
//The JPA was renamed as Jakarta Persistence in 2019 and version 3.0 was released in 2020. This included the renaming of packages and properties
//from javax. persistence to jakarta. persistence.
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Desaparecido {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 @NotBlank(message="Nome é requerido")
 private String nome;
 @Pattern(regexp="^(0?[1-9]|[12][0-9]|3[01])[\\/-](0?[1-9]|1[012])[\\/-]\\d{4}$", message="A data de nascimento deve estar no formato dd/MM/YYYY")
 //https://www.regular-expressions.info/
 private String dataNascimento;
 /**private String dataCadastro;**/
 @NotBlank(message="Sexo M/F")
 private String sexo;
 @CPF
 @Column(unique = true) // nao funciona com @Valid tem que tratar na camada de persistencia
 private String cpf;
 @NotBlank(message="O CEP é obrigatório.")
 private String cep;
 @NotBlank(message="Cor de Pele é obrigatório.")
private String cordepele;
 
 @NotBlank(message="Doença é obrigatório.")
 private String doenca;
 
 @NotBlank(message="Peso é obrigatório.")
 private float peso;
 
 @NotBlank(message="Tatuagem é obrigatório.")
 private boolean tatuagem;
 
 /**private String endereco;
 @NotBlank(message="O complemento deve ser informado")
 private String complemento;**/

public Long getId() {
 return id;
 }
public Desaparecido(String nome, String dataNascimento, String sexo, String cpf, String cep, String cordepele, String doenca, float peso, boolean tatuagem ) 
{
	this.nome = nome;
	this.dataNascimento = dataNascimento;
	this.sexo = sexo;
	this.cpf = cpf;
	this.cep = cep;
	this.cordepele = cordepele;
	this.doenca = doenca;
	this.peso = peso;
	this.tatuagem = tatuagem;
}
}