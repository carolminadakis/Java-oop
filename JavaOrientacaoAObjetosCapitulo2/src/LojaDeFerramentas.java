import java.util.Scanner;

public class LojaDeFerramentas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		Integer codigoProduto = 0;
		
		//Iniciamos o programa com "do-while", para que seja executado enquanto o número 0
		// não for digitado.
		
		do {
			System.out.println("Digite o código do produto: ");
			codigoProduto = scanner.nextInt();
			
		
		if (codigoProduto != 0) {
			
			// Vamos fazer aqui um operador ternário para escolha do corredor
			String corredor = (codigoProduto % 2 == 0) ? "\"direita\"" : "\"esquerda\"";
			
			// Através do loop, encontramos em que gaveta correta armazenar os itens, de acordo com o código.
			for (int i = 8; i >= 1; i--) {
				if (codigoProduto % i == 0) {
					System.out.println("O produto de código: " + codigoProduto
							+ " ficará no corredor da " + corredor + " na gaveta de número "
							+ i);
					break;
				}
			}
		}
		
		} while (codigoProduto != 0);
		
		scanner.close();
	}

}
