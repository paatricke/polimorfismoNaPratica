package polimorfismo;

public class ClientePremium extends Cliente {

	private final double desconto = 0.1;

	public ClientePremium(String nome) {
		super(nome);
	}

	@Override
	public void calculaDesconto(double valorDaCompra) {
		valorDaCompra = valorDaCompra - (valorDaCompra * desconto);
		System.out.println("Valor final cliente Premium: " + valorDaCompra);
	}

}
