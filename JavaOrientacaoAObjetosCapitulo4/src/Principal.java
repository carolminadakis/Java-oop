import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimir("Digite a quantidade de produtos: ");
		Integer quantidadeProdutos = scanner.nextInt();
		
		//Esse scanner abaixo � para que o programa continue armazenando a entrada de produtos
		//que o usu�rio estiver adicionando.
		scanner.nextLine();
		
		Estoque estoque = new Estoque();
		
		// instancia um array de produtos com a quantidade de posi��es informadas pelo usu�rio
		estoque.produtos = new Produtos[quantidadeProdutos];
		
		//percorre todas as posi��es no array, que est�o nulas
		//e preenche com as entradas pelo teclado do usu�rio
		
		for(int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produtos();
			imprimir("Produto: " + (i+1));
			imprimir("-----------------------------");
			
			imprimir("Descri��o: ");
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

