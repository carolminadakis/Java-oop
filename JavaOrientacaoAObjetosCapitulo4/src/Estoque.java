
public class Estoque {
	
	Produtos[] produtos;
	
	void listarProdutos () {
		System.out.println("       Produtos em estoque      ");
		System.out.println("--------------------------------");
		
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descreverProduto();
		}
	}
	 void totalProdutos() {
		Integer totalItens = 0;
		for (int x = 0; x < produtos.length; x++) {
			totalItens += produtos[x].quantidade;	
		}
		 
		System.out.println("--------------------------------");
		System.out.println("       Quantidade total: " + totalItens);
		
	}

}
