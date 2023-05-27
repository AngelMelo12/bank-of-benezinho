package com.fiap.bankbenezinho.banco;

import java.util.Collection;

public class Banco {

	private String nome;

	private Collection<Agencia> agencias;

	public Banco() {
	}

	public Banco(String nome, Collection<Agencia> agencias) {
		this.nome = nome;
		this.agencias = agencias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(Collection<Agencia> agencias) {
		this.agencias = agencias;
	}

	public void adicionaAgencia(Agencia agencia) {
		this.agencias.add(agencia);
	}

	@Override
	public String toString() {
		return "Banco{" +
				"nome='" + nome + '\'' +
				", agencias=" + agencias +
				'}';
	}
}
