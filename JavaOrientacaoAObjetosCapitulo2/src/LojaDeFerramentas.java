import java.util.Scanner;

public class LojaDeFerramentas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		Integer codigoProduto = 0;
		
		//Iniciamos o programa com "do-while", para que seja executado enquanto o n�mero 0
		// n�o for digitado.
		
		do {
			System.out.println("Digite o c�digo do produto: ");
			codigoProduto = scanner.nextInt();
			
		
		if (codigoProduto != 0) {
			
			// Vamos fazer aqui um operador tern�rio para escolha do corredor
			String corredor = (codigoProduto % 2 == 0) ? "\"direita\"" : "\"esquerda\"";
			
			// Atrav�s do loop, encontramos em que gaveta correta armazenar os itens, de acordo com o c�digo.
			for (int i = 8; i >= 1; i--) {
				if (codigoProduto % i == 0) {
					System.out.println("O produto de c�digo: " + codigoProduto
							+ " ficar� no corredor da " + corredor + " na gaveta de n�mero "
							+ i);
					break;
				}
			}
		}
		
		} while (codigoProduto != 0);
		
		scanner.close();
	}

}
