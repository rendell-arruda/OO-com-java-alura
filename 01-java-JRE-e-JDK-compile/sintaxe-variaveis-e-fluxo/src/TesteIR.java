
public class TesteIR {
	public static void main(String[] args) {

		double salario = 3751.1;

		if (salario <= 2800.0) {
		    System.out.println("A sua aliquota é de 7,5%");
            System.out.println("Você pode deduzir até R$ 142");
		} else if (salario >2800 && salario <= 3751.0) {
			System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");
		}else if (salario > 3751.0 && salario <= 4664.0) {
			System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$ 636");
		}
	}
}
