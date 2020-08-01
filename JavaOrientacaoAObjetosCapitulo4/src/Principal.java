import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimir("Digite a quantidade de produtos: ");
		Integer quantidadeProdutos = scanner.nextInt();
		
		//Esse scanner abaixo é para que o programa continue armazenando a entrada de produtos
		//que o usuário estiver adicionando.
		scanner.nextLine();
		
		Estoque estoque = new Estoque();
		
		// instancia um array de produtos com a quantidade de posições informadas pelo usuário
		estoque.produtos = new Produtos[quantidadeProdutos];
		
		//percorre todas as posições no array, que estão nulas
		//e preenche com as entradas pelo teclado do usuário
		
		for(int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produtos();
			imprimir("Produto: " + (i+1));
			imprimir("-----------------------------");
			
			imprimir("Descrição: ");
			estoque.produtos[i].descricao = scanner.nextLine();
			
			imprimir("Quantidade de itens: ");
			estoque.produtos[i].quantidade = scanner.nextInt();
			scanner.nextLine();
		}
		
		estoque.listarProdutos();
		
		estoque.totalProdutos();
		
		scanner.close();
	}
		static void imprimir(String texto) {
			System.out.println(texto);
			
		}
			

	}

