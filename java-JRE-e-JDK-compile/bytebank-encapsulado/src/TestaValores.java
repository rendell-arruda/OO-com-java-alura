
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24565);
			
		System.out.println(conta.getAgencia());
		Conta conta2 = new Conta(1337, 24569);
		Conta conta3 = new Conta(1337, 24365);

		
	System.out.println(Conta.getTotal());
	}
	
}
