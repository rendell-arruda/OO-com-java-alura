
public class TesteDeReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		Conta segundaConta = primeiraConta;
	}

}
