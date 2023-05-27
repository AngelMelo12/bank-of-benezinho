package com.fiap.bankbenezinho;

import java.util.Vector;

import javax.swing.*;

import com.fiap.bankbenezinho.banco.Agencia;
import com.fiap.bankbenezinho.banco.Banco;
import com.fiap.bankbenezinho.conta.ContaCorrente;
import com.fiap.bankbenezinho.pessoa.Pessoa;
import com.fiap.bankbenezinho.pessoa.PessoaFisica;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String CPF = JOptionPane.showInputDialog("Digite o seu número de documento:");
        String nomeMae = JOptionPane.showInputDialog("Digite o nome da sua mãe:");
        String CPFMae = JOptionPane.showInputDialog("Digite o número de documento da sua mãe:");

        PessoaFisica mae = new PessoaFisica();
        mae.setNome(nomeMae);
        mae.setCPF(CPFMae);

        PessoaFisica usuario = new PessoaFisica(nome, CPF, mae);
        Vector<Pessoa> titulares = new Vector<>();
        titulares.add(usuario);

        Banco itau = new Banco();
        itau.setNome("Itaú");
        itau.setAgencias(new Vector<>());

        Agencia agencia1 = new Agencia();
        agencia1.setNome("AG 1");
        agencia1.setNumero("1");
        agencia1.setContas(new Vector<>());

        Agencia agencia2 = new Agencia();
        agencia2.setNome("AG 2");
        agencia2.setNumero("2");
        agencia2.setContas(new Vector<>());

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumero("123");
        contaCorrente.setAgencia(agencia1);
        contaCorrente.setTitulares(titulares);
        contaCorrente.setSaldo(0.0);
        contaCorrente.setLimite(1000.0);
        agencia1.adicionaConta(contaCorrente);

        itau.adicionaAgencia(agencia1);
        itau.adicionaAgencia(agencia2);
        agencia1.setBanco(itau);
        agencia2.setBanco(itau);

        System.out.println(itau);
    }
}