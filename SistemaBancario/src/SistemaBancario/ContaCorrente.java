package SistemaBancario;

public class ContaCorrente extends Conta  {

	Double limite;
	Double limiteUtilizado;
	Double jurosLimite;
	
	public Double getLimite() {
		
		Long v = Math.round(limite);
		
		return v.doubleValue();
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	
}