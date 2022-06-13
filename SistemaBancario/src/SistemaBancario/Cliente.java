package SistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private Double salario;

	private List<Conta> contasDoCliente = new ArrayList<Conta>();

	public String getNome() {
		return nome;
	}

	public List<Conta> getContasDoCliente() {
		return contasDoCliente;
	}

	public void setContasDoCliente(List<Conta> contasDoCliente) {
		this.contasDoCliente = contasDoCliente;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
