
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();
		//comecou a popular a conta
		
		contaDaMarcela.titular.nome = "Marcela";
		
		System.out.println(contaDaMarcela.titular.nome);
		
		
	}
}
