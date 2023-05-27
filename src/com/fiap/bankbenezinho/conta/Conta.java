package com.fiap.bankbenezinho.conta;

import java.util.Collection;

import com.fiap.bankbenezinho.banco.Agencia;
import com.fiap.bankbenezinho.pessoa.Pessoa;

public abstract class Conta {

	private String numero;

	private double saldo;

	private Collection<Pessoa> titulares;

	private Agencia agencia;

	public Conta() {
	}

	public Conta(String numero, double saldo, Collection<Pessoa> titulares, Agencia agencia) {
		this.numero = numero;
		this.saldo = saldo;
		this.titulares = titulares;
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Collection<Pessoa> getTitulares() {
		return titulares;
	}

	public void setTitulares(Collection<Pessoa> titulares) {
		this.titulares = titulares;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Conta{" +
				"numero='" + numero + '\'' +
				", saldo=" + saldo +
				", titulares=" + titulares + '}';
	}
}
