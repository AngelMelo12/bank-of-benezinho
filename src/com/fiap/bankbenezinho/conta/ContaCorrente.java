package com.fiap.bankbenezinho.conta;

import java.util.Collection;

import com.fiap.bankbenezinho.banco.Agencia;
import com.fiap.bankbenezinho.pessoa.Pessoa;

public class ContaCorrente extends Conta {

	private double limite;

	public ContaCorrente() {
	}

	public ContaCorrente(String numero, double saldo, Collection<Pessoa> titulares, Agencia agencia, double limite) {
		super(numero, saldo, titulares, agencia);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}


	@Override
	public String toString() {
		return "ContaCorrente{" +
				"limite=" + limite +
				"} " + super.toString();
	}
}
