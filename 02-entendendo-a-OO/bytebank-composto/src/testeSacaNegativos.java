
public class testeSacaNegativos {
	public static void main(String[] args) {
		Conta conta = new Conta ();
		conta.deposita(100);
//		System.out.println(conta.saldo);
		System.out.println(conta.saca(200));
		System.out.println(conta.pegaSaldo());
		
//		queremos proibir o acesso aos atributos, sendo acessado apenas por metodos
//		conta.saldo = conta.saldo - 101;
		
	}
}
