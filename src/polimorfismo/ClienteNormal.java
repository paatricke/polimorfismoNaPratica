package polimorfismo;

public class ClienteNormal extends Cliente {

	private final double desconto = 0.05;

	public ClienteNormal(String nome) {
		super(nome);
	}

	@Override
	public void calculaDesconto(double valorDaCompra) {
		valorDaCompra = valorDaCompra - (valorDaCompra * desconto);
		System.out.println("Valor final cliente normal: " + valorDaCompra);
	}

}
