package polimorfismo;

public abstract class Cliente {

	protected String nome;

	public abstract void calculaDesconto(double valorDaCompra);

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

}
