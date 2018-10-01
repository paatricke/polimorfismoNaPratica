package polimorfismo;

public class ClienteTest {

	public static void main(String[] args) {
		
		ClienteNormal cn = new ClienteNormal("Julian Casablancas");
		ClientePremium cp = new ClientePremium("Alex Turner");
		
		Compra compra = new Compra();
		
		compra.realizaCompra(cn, 300);
		compra.realizaCompra(cp, 300);
		
	}
}
