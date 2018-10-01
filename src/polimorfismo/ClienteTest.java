package polimorfismo;

public class ClienteTest {

	public static void main(String[] args) {
		
		ClienteNormal cn = new ClienteNormal("Julian Casablancas");
		ClientePremium cp = new ClientePremium("Alex Turner");
		
		System.out.println("Ambos fazem compras de $300");
		cn.calculaDesconto(300);
		cp.calculaDesconto(300);
	}
}
