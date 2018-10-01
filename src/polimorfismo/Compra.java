package polimorfismo;

public class Compra {

	public void realizaCompra(Cliente cliente, double valorDaCompra) {
		cliente.calculaDesconto(valorDaCompra);
	}
}
