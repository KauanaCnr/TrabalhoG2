package SistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Conta{


	private Cliente titular;
	private Agencia agencia;
	private String banco;
	private Double saldo = 0d;
	
	private List<String> historicoMovimentacoes;
	
	public Conta() {
		
		historicoMovimentacoes = new ArrayList<String>();
	}
	
	public Conta(String titular) {
		
	}
	
	public void gerarExtrato() {
		
		System.out.println("Extrato do cliente "+this.titular.getNome());
		
		for (String entradaSaida : historicoMovimentacoes) {
			
			System.out.println(entradaSaida);
		}
	}
	
	public void sacar(Double valorSaque) {
		
		this.saldo -= valorSaque;
		
		historicoMovimentacoes.add("Saque de "+valorSaque+".");
	}
	

	public void sacar(Double valorSaque, String data) {
		
		
	}
	
	public void depositar(Double valorDeposito) {
		
		this.saldo += valorDeposito;
		
		historicoMovimentacoes.add("Depósito de "+valorDeposito+".");
	}
	
	public Double consultarSaldo() {
		
		return null;
	}
	
	public void transferir(Double valorTransferir, Conta contaDestino) {
		
		Double novoSaldo = this.saldo - valorTransferir;
		
		if (novoSaldo > 0) {
			
			this.saldo = novoSaldo;
			contaDestino.saldo += valorTransferir;
			
		} else {
			
			System.out.println("Saldo insuficiente.");
		}
	}

	
	
	public Agencia getAgencia() {
		return agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}

