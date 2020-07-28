
public class Passeio {

	public static void main(String[] args) {
		
		//Declaração e instaciamento da variável pessoaUm, com o objeto do tipo Pessoa.
		Pessoa pessoaUm = new Pessoa();
		//Acessando atributo do objeto Pessoa por meio do (.nome).
		pessoaUm.nome = "Tereza";
		
		pessoaUm.cachorro = new Cachorro();
		
		pessoaUm.cachorro.nome = "Hully";
		pessoaUm.cachorro.idade = 16;
		pessoaUm.cachorro.raça = "Poodle Toy";
		pessoaUm.cachorro.sexo = 'F';
		
		Caminhada c = new Caminhada();
		c.andar(pessoaUm);

	}

}
