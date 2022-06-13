package SistemaBancario;

public class Agencia {

	static Integer numeroGlobal = 1;

	Integer numero;
	String endereco;
	Banco banco;

	public Agencia() {

		numero = numeroGlobal++;
	}

}
