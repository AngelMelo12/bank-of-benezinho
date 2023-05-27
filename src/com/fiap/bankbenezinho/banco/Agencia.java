package com.fiap.bankbenezinho.banco;

import java.util.Collection;

import com.fiap.bankbenezinho.conta.Conta;

public class Agencia {

	private String numero;

	private String nome;

	private Collection<Conta> contas;

	private Banco banco;

	public Agencia() {
	}

	public Agencia(String numero, String nome, Collection<Conta> contas, Banco banco) {
		this.numero = numero;
		this.nome = nome;
		this.contas = contas;
		this.banco = banco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Conta> getContas() {
		return contas;
	}

	public void setContas(Collection<Conta> contas) {
		this.contas = contas;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public void adicionaConta(Conta conta) {
		this.contas.add(conta);
	}

	@Override
	public String toString() {
		return "Agencia{" +
				"numero='" + numero + '\'' +
				", nome='" + nome + '\'' +
				", contas=" + contas + '}';
	}
}
