import java.util.Scanner;

public class CalculadoraProfessor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pi = 3.14;
		
		System.out.print("Digite o valor do raio: ");
		double valorRaio = scanner.nextDouble();
		
		double valorArea = (valorRaio * valorRaio) *pi;
		
		int valorSemDecimais = (int) valorArea;
		
		System.out.print("Deseja mostrar o c�lculo detalhado?"
				+ "\nCaso sim, digite: true \nCaso n�o, digite: false: ");
		boolean calculoDetalhado = scanner.nextBoolean();
		
		
		if (calculoDetalhado == true) {
			System.out.println("raio * raio * pi = ");
		}
		System.out.println("O valor da �rea �: " + valorArea);
		System.out.println("O valor da �rea, sem decimais �: " + valorSemDecimais);
		
		
		scanner.close();
		
	}

}
