package com.fiap.bankbenezinho.conta;

import java.util.Collection;

import com.fiap.bankbenezinho.banco.Agencia;
import com.fiap.bankbenezinho.pessoa.Pessoa;

public class ContaPoupanca extends Conta {

	private int aniversario;

	public ContaPoupanca() {
	}

	public ContaPoupanca(String numero, double saldo, Collection<Pessoa> titulares, Agencia agencia, int aniversario) {
		super(numero, saldo, titulares, agencia);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return "ContaPoupanca{" +
				"aniversario=" + aniversario +
				"} " + super.toString();
	}
}
