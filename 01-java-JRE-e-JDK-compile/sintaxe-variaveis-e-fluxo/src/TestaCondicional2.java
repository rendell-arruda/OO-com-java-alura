
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("O valor de acompanhado é :" + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
		
		

	}
}
