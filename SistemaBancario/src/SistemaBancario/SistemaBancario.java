package SistemaBancario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaBancario {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		
		Cliente cli = new Cliente();
		cli.setNome("Ana Maria");
		cli.setCpf("213910239102");
		
	try (Scanner s = new Scanner(System.in)) {
		List<Cliente> clientesCadastrados = new ArrayList<Cliente>();
		
		while (true) {
			System.out.println("Inserir novo cliente?");
			String resposta = s.next();
			
			if (resposta.contentEquals("0")) {
				
				break;
				
			} else {
				
				Cliente cli1 = new Cliente();
				
				System.out.println("Nome?");
				String nome = s.next();
				
				cli1.setNome(nome);
				// ...
				
				clientesCadastrados.add(cli1);
			}
		}
	}
		
		Cliente clienteDois = new Cliente();
		clienteDois.setNome("Bruno Souza");
		clienteDois.setCpf("219831928354");
		
		Conta c2 = new ContaCorrente();
		c2.setBanco("BB");
		c2.setSaldo(180d);
		c2.setTitular(clienteDois);
		
		
		clienteDois.getContasDoCliente().add(c2);
		
		c2.depositar(10d);
		c2.depositar(20d);
		
		c1.setTitular(cli);
		cp1.setTitular(cli);
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(c1);
		contas.add(cp1);
		
		cli.setContasDoCliente(contas);

		c1.getTitular().getNome();
		
		
		((ContaCorrente)c1).limite = 100d;
		
		c1.depositar(100d);
		c1.depositar(200d);
		c1.sacar(50d);
		
		c1.gerarExtrato();
		
		cp1.depositar(320d);
		cp1.depositar(70d);
		cp1.depositar(45d);
	}


}
