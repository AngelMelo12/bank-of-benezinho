package com.fiap.bankbenezinho.pessoa;

import java.util.Collection;

public class PessoaJuridica extends Pessoa {

	private String CNPJ;

	private String razaoSocial;

	private Collection<Pessoa> socios;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, String CNPJ, String razaoSocial, Collection<Pessoa> socios) {
		super(nome);
		this.CNPJ = CNPJ;
		this.razaoSocial = razaoSocial;
		this.socios = socios;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Collection<Pessoa> getSocios() {
		return socios;
	}

	public void setSocios(Collection<Pessoa> socios) {
		this.socios = socios;
	}

	@Override
	public String toString() {
		return "PessoaJuridica{" +
				"CNPJ='" + CNPJ + '\'' +
				", razaoSocial='" + razaoSocial + '\'' +
				", socios=" + socios +
				"} " + super.toString();
	}
}
