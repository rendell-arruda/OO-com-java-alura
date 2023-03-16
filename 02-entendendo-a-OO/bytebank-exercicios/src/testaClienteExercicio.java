
public class testaClienteExercicio {
	public static void main(String[] args) {
//		instancia uma conta
		Conta contaDoRendell = new Conta();
//		instancia um cliente e vincula a conta
		contaDoRendell.titular = new Cliente();
//		atribui o nome do cliente ao objeto Cliente
		contaDoRendell.titular.nome = "Rendell Arruda";	
	}
}
